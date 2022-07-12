package Homework.books.model;

public class Books {
    private String title;
    private Author author;
    private double price;
    private int count;
    private String genre;
    private User registeredUser;

    public Books(String title, Author author, double price, int count, String genre,User registeredUser) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.count = count;
        this.genre = genre;
        this.registeredUser = registeredUser;
    }

    public Books() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuther(Author author) {
        this.author = author;
    }


    public void setAuthorName(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", authorName='" + author + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", genre='" + genre + '\'' +
                ", registeredUser='" + registeredUser+ '\'' +
                '}';
    }
}
