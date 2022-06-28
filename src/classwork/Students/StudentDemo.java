package classwork.Students;

import java.util.Scanner;

public class StudentDemo implements commands {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input" + EXIT + "for exit");
            System.out.println("please input"+ADD_STUDENT+"for add student");
            System.out.println("please input"+ PRINT_ALL_STUDENT+" for print all student");
            System.out.println("please input "+PRINT_STUDENT_COUNT+" for student count");
            System.out.println("please input"+DELETE_STUDENT_BY_INDEX+" for delete student by index");
            System.out.println("please input "+PRINT_STUDENTS_BY_LESSON+" for print student by lesson");
            System.out.println("please inout "+CHANGE_STUDENT_LESSON+"for change students lesson");
            int command = Integer.parseInt(scanner.nextLine());
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
                default:
                    System.out.println("Invalid command,please try again");
            }
        }


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
            System.out.println("please input new lesson name");
            String lessonname = scanner.nextLine();
            if (lessonname != null && !lessonname.trim().equals("")) {
                student.setLesson(lessonname.trim());
                System.out.println();
            } else {
                System.out.println("invalid index please try again");
                changeStudentLesson();
            }
        }
    }

    private static void addStudent() {
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
        System.out.println("please input student lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);
        Student student = new Student(name, surnam, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("thank you,student added");
    }
}

