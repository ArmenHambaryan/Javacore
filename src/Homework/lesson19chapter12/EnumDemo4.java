package Homework.lesson19chapter12;

public class EnumDemo4 {
    public static void main(String[] args) {

        Apple ap, ap2, ap3;

        //получить все порядковые значения
        // с помощью метода ordinal()
        System.out.println("  Bce константы сортов яблок " + " и их порядковые значения: ");
        for (Apple value : Apple.values()) {
            System.out.println(value + " " + value.ordinal());
        }
        ap = Apple.REDDEL;
        ap2 = Apple.GOLDENDEL;
        ap3 = Apple.REDDEL;


        System.out.println();

        // продемонстрировать применение
        // методов compareTo() и equals()

        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " nредшествуе " + ap2);
        }
        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap2 + " предшествует " + ap);
        }
        if (ap.compareTo(ap3) == 0) {
            System.out.println(ap + " равно " + ap3);
        }
        System.out.println();

        if (ap.equals(ap2)) {
            System.out.println("Oшибкa!");
        }
        if (ap.equals(ap3)) {
            System.out.println(ap + " равно " + ap3);
        }
        if (ap == ap3) {
            System.out.println(ap+ " == " + ap3);
        }
    }
}
