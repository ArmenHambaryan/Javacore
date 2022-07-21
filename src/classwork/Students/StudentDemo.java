package classwork.Students;

import classwork.Students.commands.commands;
import classwork.Students.exception.LessonNotFoundException;
import classwork.Students.modul.Lesson;
import classwork.Students.modul.Student;
import classwork.Students.modul.User;
import classwork.Students.modul.UserType;
import classwork.Students.storage.LessonStorage;
import classwork.Students.storage.StudentStorage;
import classwork.Students.storage.UserStorage;

import java.util.Date;
import java.util.Scanner;

import static classwork.Students.util.DateUtil.stringToDate;

public class StudentDemo implements commands {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();
    private static UserStorage userStorage = new UserStorage();
    private static User currentUser = null;

    public static void main(String[] args) {
        initData();
        boolean run = true;
        while (run) {
            commands.printLogincommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("invalid command");
            }

        }


    }

    private static void register() {
        System.out.println("please input name,surname,email,password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("please input corect data!");
        } else {
            if (userStorage.getUserByEmail(userData[0]) == null) {
                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setUserType(UserType.USER);
                userStorage.add(user);
                System.out.println("user created!");
            } else {
                System.out.println("user with " + userData[0] + " already exist");
            }
        }


    }

    private static void loginAdmin() {
        System.out.println("Welcome " + currentUser.getName());
        boolean run = true;
        while (run) {
            commands.printAdmincommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENT:
                    studentStorage.print();
                    break;
                case PRINT_STUDENT_COUNT:
                    System.out.println(studentStorage.getSize());
                    break;
                case DELETE_STUDENT_BY_INDEX:
                    deleteStudentByIndex();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    searchStudentByLessonName();
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLesson();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command,please try again");
            }
        }
    }

    private static void initData() {
        User admin = new User("admin", "admin", "admin@mail.com", "admin", UserType.ADMIN);
        userStorage.add(admin);
    }

    private static void login() {
        System.out.println("please inpud email,password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User with " + emailPassword[0] + " does not exist!");

        } else {
            if (user.getPassword().equals(emailPassword[1])) {
                currentUser=user;
                if (user.getUserType() == UserType.ADMIN) {
                    loginAdmin();
                } else if (user.getUserType() == UserType.USER) {
                    loginUser();
                }
            } else {
                System.out.println("password is wrong");
            }
        }

    }

    private static void loginUser() {
        System.out.println("Welcome " + currentUser.getName());
        boolean run = true;
        while (run) {
            commands.printUsercommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENT:
                    studentStorage.print();
                    break;
                case PRINT_STUDENT_COUNT:
                    System.out.println(studentStorage.getSize());
                    break;

                case PRINT_STUDENTS_BY_LESSON:
                    searchStudentByLessonName();
                    break;
                case PRINT_ALL_LESSONS:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command,please try again");
            }
        }
    }

    private static void addLesson() {
        System.out.println("please input lesson name");
        String name = scanner.nextLine();

        System.out.println("please input lesson price");
        Double price = Double.parseDouble(scanner.nextLine());

        System.out.println("please input teacherName");
        String teacherName = scanner.nextLine();

        System.out.println("please input lesson duration by month");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.println("input lesson start day (14/04/2022)");
        String strdate = scanner.nextLine();
        Lesson lesson = new Lesson(name, price, teacherName, duration,stringToDate(strdate));
        lessonStorage.add(lesson);
        System.out.println("lesson created");

    }

    private static void searchStudentByLessonName() {
        System.out.println("please input lesson name");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLesson(lessonName);
    }

    private static void deleteStudentByIndex() {
        studentStorage.print();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.delete(index);
        return;
    }

    private static void changeStudentLesson() {
        studentStorage.print();
        System.out.println("please choose student index");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if (student != null) {
            lessonStorage.print();
            System.out.println("please choose lesson index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            try {
                Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                student.setLesson(lesson);
                System.out.println("lesson changed!");
            } catch (LessonNotFoundException e) {
                System.out.println(e.getMessage());
                changeStudentLesson();
            }
        } else {
            System.out.println("invalid index please try again");
            changeStudentLesson();

        }
    }

    private static void addStudent() {
        if (lessonStorage.getSize() == 0) {
            System.out.println("please add Lesson");
            addLesson();
        } else {
            lessonStorage.print();
            System.out.println("please choose lesson index");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            try {
                Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                System.out.println("please input student name");
                String name = scanner.nextLine();
                System.out.println("please input student surname");
                String surnam = scanner.nextLine();
                System.out.println("please input student age");
                String ageStr = scanner.nextLine();
                System.out.println("please input student phoneNumber");
                String phoneNumber = scanner.nextLine();
                System.out.println("please input student city");
                String city = scanner.nextLine();

                int age = Integer.parseInt(ageStr);
                Student student = new Student(name, surnam, age, phoneNumber, city, lesson,currentUser,new Date());
                studentStorage.add(student);
                System.out.println("thank you,student added");
            } catch (LessonNotFoundException e) {
                System.out.println(e.getMessage());
                addStudent();

            }

        }

    }


}


