package Homework.books.exception;

public class AuthorNotFaundException extends Exception{
    public AuthorNotFaundException() {
    }

    public AuthorNotFaundException(String message) {
        super(message);
    }
}
