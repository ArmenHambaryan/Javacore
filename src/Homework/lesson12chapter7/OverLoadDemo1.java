package Homework.lesson12chapter7;

public class OverLoadDemo1 {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    //Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a u b :" + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    //параметра типа douЫe
    void test(double a) {
        System.out.println("Bнyтpeннee преобразование при вызове" + "test(douЬle) а:" + a);
    }
}
