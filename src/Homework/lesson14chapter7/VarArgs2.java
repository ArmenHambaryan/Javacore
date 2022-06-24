package Homework.lesson14chapter7;

//Использовать аргументы переменной длины вместе
// со стандартными аргументами
public class VarArgs2 {
    // В данном примере msg - обычный параметр,
    // а v - параметр переменной длины
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Содержимое: ");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один параметр переменной длины:",10);
        vaTest("Tpи параметра переменной длины: ",1,2, 3);
        vaTest("Без параметров переменной длины: ");
    }

}
