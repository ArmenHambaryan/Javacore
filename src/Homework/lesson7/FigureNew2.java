package Homework.lesson7;

public class FigureNew2 {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print(" *");

            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");

            }
            for (int j = 4; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();


        }

    }
}

