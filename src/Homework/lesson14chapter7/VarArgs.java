package Homework.lesson14chapter7;
// Продемонстрировать применение аргументов
//переменной длины
public class VarArgs {
       // теперь метод vaTest() объявляется с аргументами
      // переменной длины
    static void vaTest(int...v){
        System.out.print("Koличecтвo аргументов: "
                + v.length + " Содержимое:");
        for (int i : v) {
            System.out.print(i+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Обратите внимание на возможные способы вызова
        // метода vaTest() с аргументами переменной длины
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}