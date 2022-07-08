package Homework.books;

import Homework.books.commands.commands;
import Homework.books.exception.AutherNotFaundException;
import Homework.books.model.Auther;
import Homework.books.model.Books;
import Homework.books.model.Gender;
import Homework.books.storage.AutherStorage;
import Homework.books.storage.BooksStorage;

import java.util.Scanner;

public class BooksDemo implements commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BooksStorage booksStorage = new BooksStorage();
    private static AutherStorage autherStorage = new AutherStorage();

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
                case ADD_BOOK:
                    addbook();
                    break;
                case PRINT_ALL_BOOKS:
                    booksStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    printByAutherName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                case ADD_AUTHER:
                    addauther();
                    break;
                case PRINT_ALL_AUTHERS:
                    autherStorage.print();
                    break;

                default:
                    System.out.println("invalid command");
            }

        }

    }

    private static void login() {
        String login = "auther";
        String password = "123456";
        System.out.println("please input login");
        if (!login.equals(scanner.nextLine())) {
            System.err.println("wrrong login");
            login();
        }
        System.out.println("please input password ");
        if (!password.equals(scanner.nextLine())) {
            System.err.println("wrrong password");
            return;
        }


    }


    private static void addauther() {
        System.out.println("please input auther name");
        String name = scanner.nextLine();

        System.out.println("please input auther surname");
        String surname = scanner.nextLine();

        System.out.println("please input auther email");
        String email = scanner.nextLine();
        try {
            System.out.println("pleas input auther gender");
            Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase().trim());
            Auther auther = new Auther(name, surname, email, gender);
            autherStorage.add(auther);
            System.out.println("auther created");

        } catch (IllegalArgumentException e) {
            System.out.println("please input corect gender");
            addbook();
        }


    }


    private static void printBooksByPriceRange() {
        try {
            System.out.println("please input min price");
            double max = Double.parseDouble(scanner.nextLine());
            System.out.println("please input max price");
            double min = Double.parseDouble(scanner.nextLine());
            booksStorage.printBooksByPriceRange(min, max);
        } catch (NumberFormatException e) {
            System.err.println("use only numbers");
            printBooksByPriceRange();
        }


    }


    private static void printBooksByGenre() {
        System.out.println("please input genre");
        String name = scanner.nextLine();
        booksStorage.printBookssByGenre(name);
    }

    private static void printByAutherName() {
        System.out.println("please input name");
        String name = scanner.nextLine();
        booksStorage.printByAuther(name);
    }

    private static void addbook() {
        if (autherStorage.getSize() == 0) {
            System.out.println("please add auther");
            addauther();
        } else {
            autherStorage.print();
            System.out.println("please choose auther index");
            int autherindex = Integer.parseInt(scanner.nextLine());
            try {
                Auther auther = autherStorage.getAutherByIndex(autherindex);
                System.out.println("pleas input books title name");
                String title = scanner.nextLine();
                System.out.println("please input books price");
                String priceStr = scanner.nextLine();
                System.out.println("please input books count ");
                String countStr = scanner.nextLine();
                System.out.println("please input books genre");
                String genre = scanner.nextLine();


                double price = Integer.parseInt(priceStr);
                int count = Integer.parseInt(countStr);
                Books books = new Books(title, auther, price, count, genre);
                booksStorage.add(books);
                System.out.println("thanks for added");
            } catch (AutherNotFaundException e) {
                System.out.println(e.getMessage());
                addbook();


            }
        }

    }
}

