package Homework.books.commands;

public interface commands {
    int EXIT=0;
    int ADD_BOOK=1;
    int PRINT_ALL_BOOKS=2;
    int PRINT_BOOKS_BY_AUTHOR_NAME=3;
    int PRINT_BOOKS_BY_GENRE=4;
    int PRINT_BOOKS_BY_PRICE_RANGE=5;
    int ADD_AUTHER=6;
    int PRINT_ALL_AUTHERS=7;
    static void printcommands() {
        System.out.println("please input " + EXIT + " for exit");
        System.out.println("please input " + ADD_BOOK + " for added book");
        System.out.println("please input " + PRINT_ALL_BOOKS + " for print all books");
        System.out.println("please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by AutherName");
        System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
        System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");
        System.out.println("please input " +ADD_AUTHER + " for add auther");
        System.out.println("please input " +PRINT_ALL_AUTHERS+ " for print all authers");
    }
}

