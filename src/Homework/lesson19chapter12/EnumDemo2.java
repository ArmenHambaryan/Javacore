package Homework.lesson19chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Константы перечислимого типа Apple:");

        // применить метод values()
        Apple[] allApples = Apple.values();
        for (Apple allApple : allApples) {
            System.out.println(allApple);
            System.out.println();
        }
        // применить метод valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("Пepeмeннaя ар содержит" + ap);
    }
}
