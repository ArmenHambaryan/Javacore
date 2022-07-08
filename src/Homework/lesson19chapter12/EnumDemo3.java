package Homework.lesson19chapter12;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;

        // вывести цену на яблоко сорта Winesap
        System.out.println(" Яблoкo сорта Winesap стоит " + Apple.WINESAP.getPrice() + " центов. \n ");

        // вывести цены на все сорта яблок
        System.out.println("Цeны на все сорта яблок:");
        for (Apple value : Apple.values()) {
            System.out.println(value + " стоит " + value.getPrice() + " центов. ");
        }
    }


}



