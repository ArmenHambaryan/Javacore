package classwork.Students;

import classwork.Students.commands.commands;
import classwork.Students.exception.LessonNotFoundException;
import classwork.Students.modul.Lesson;
import classwork.Students.modul.Student;
import classwork.Students.storage.LessonStorage;
import classwork.Students.storage.StudentStorage;

import java.util.Scanner;

public class StudentDemo implements commands {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        login();
        boolean run = true;
        while (run) {
            commands.printcommands();
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

    private static void login() {
        String login = "student";
        String password="123456";
        System.out.println("please input login");
        if (!login.equals(scanner.nextLine())){
            System.out.println("wrrong login");
            login();
        }
        System.out.println("please input password");
        if (!password.equals(scanner.nextLine())){
            System.out.println("wrrong password");
            return;
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

        Lesson lesson = new Lesson(name, price, teacherName, duration);
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
                Student student = new Student(name, surnam, age, phoneNumber, city, lesson);
                studentStorage.add(student);
                System.out.println("thank you,student added");
            } catch (LessonNotFoundException e) {
                System.out.println(e.getMessage());
                addStudent();

            }

        }

    }


}


