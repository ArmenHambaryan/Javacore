package Homework.lesson18chapter10;

public class ThrowsDemo {
    static void throwone() throws IllegalAccessException {
        System.out.println("B теле метода throwOne()");
        throw new IllegalAccessException("дeмoнcтpaция");
    }

    public static void main(String[] args) {
        try {
            throwone();
        } catch (IllegalAccessException e) {
            System.out.println("Пepexвaчeнo исключение:" + e);
        }
    }
}
