package classwork.Students.commands;

public interface commands {
    int LOGOUT = 0;
    int ADD_STUDENT = 1;
    int PRINT_ALL_STUDENT = 2;
    int PRINT_STUDENT_COUNT = 3;
    int DELETE_STUDENT_BY_INDEX = 4;
    int PRINT_STUDENTS_BY_LESSON = 5;
    int CHANGE_STUDENT_LESSON = 6;
    int ADD_LESSON = 7;
    int PRINT_ALL_LESSONS = 8;

    int EXIT = 0;
    int LOGIN = 1;
    int REGISTER = 2;

    static void printAdmincommands() {
        System.out.println("please input " + LOGOUT + " for LOGOUT");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_ALL_STUDENT + " for print all student");
        System.out.println("please input " + PRINT_STUDENT_COUNT + " for student count");
        System.out.println("please input " + DELETE_STUDENT_BY_INDEX + " for delete student by index");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print student by lesson");
        System.out.println("please input " + CHANGE_STUDENT_LESSON + " for change students lesson");
        System.out.println("please input " + ADD_LESSON + " for add lesson");
        System.out.println("please input " + PRINT_ALL_LESSONS + " for print all lessons");
    }
    static void printUsercommands() {
        System.out.println("please input " + LOGOUT + " for LOGOUT");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_ALL_STUDENT + " for print all student");
        System.out.println("please input " + PRINT_STUDENT_COUNT + " for student count");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print student by lesson");
        System.out.println("please input " + PRINT_ALL_LESSONS + " for print all lessons");
    }

    static void printLogincommands() {
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + LOGIN + " for LOGIN");
        System.out.println("please input " + REGISTER + " for REGISTER");

    }
}
