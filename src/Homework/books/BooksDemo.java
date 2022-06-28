package Homework.books;

import java.util.Scanner;

public class BooksDemo implements commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BooksStorage booksStorage = new BooksStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input " + EXIT + " for exit");
            System.out.println("please input " + ADD_BOOK + " for added book");
            System.out.println("please input " + PRINT_ALL_BOOKS + " for print all books");
            System.out.println("please input " + PRINT_BOOKS_BY_AUTHOR_NAME + " for print books by AutherName");
            System.out.println("please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
            System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print books by price range");
            int command = Integer.parseInt(scanner.nextLine());
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
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;

                default:
                    System.out.println("invalid command");
            }

        }

    }

    private static void printBooksByPriceRange() {
        System.out.println("please input min price");
        double max = Double.parseDouble(scanner.nextLine());
        System.out.println("please input max price");
        double min = Double.parseDouble(scanner.nextLine());
        booksStorage.printBooksByPriceRange(min,max);
    }


    private static void printBooksByGenre() {
        System.out.println("please input genre");
        String name = scanner.nextLine();
        booksStorage.printBookssByGenre(name);
    }

    private static void printByAutherName() {
        System.out.println("please input name");
        String name = scanner.nextLine();
        booksStorage.printByAutherName(name);
    }

    private static void addbook() {
        System.out.println("pleas input books title name");
        String title = scanner.nextLine();
        System.out.println("please input books AutherName");
        String autherName = scanner.nextLine();
        System.out.println("please input books price");
        String priceStr = scanner.nextLine();
        System.out.println("please input books count ");
        String countStr = scanner.nextLine();
        System.out.println("please input books genre");
        String genre = scanner.nextLine();


        double price = Integer.parseInt(priceStr);
        int count = Integer.parseInt(countStr);
        Books books = new Books(title, autherName, price, count, genre);
        booksStorage.add(books);
        System.out.println("thanks for added");
    }
}

