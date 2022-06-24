package classwork.Students;

import java.util.Scanner;

public class StudentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add student");
            System.out.println("please input 2 for print all student");
            System.out.println("please input 3 for student count");
            System.out.println("please input 4 for delete student by index");
            System.out.println("please input 5 for print student by lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.print();
                    break;
                case 3:
                    System.out.println(studentStorage.getSize());
                    break;
                case 4:
                    studentStorage.print();
                    System.out.println("please choose student index");
                    int index=Integer.parseInt(scanner.nextLine());
                    studentStorage.delete(index);
                    break;
                case 5:
                    System.out.println("please input lesson name");
                    String lessonName=scanner.nextLine();
                    studentStorage.printStudentsByLesson(lessonName);
                    break;
                default:
                    System.out.println("Invalid command,please try again");
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
        Student student = new Student(name, surnam, age, phoneNumber, city,lesson);
        studentStorage.add(student);
        System.out.println("thank you,student added");
    }
}
