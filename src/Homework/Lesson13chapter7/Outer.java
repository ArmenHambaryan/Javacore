package Homework.Lesson13chapter7;

//Эта программа не подлежит компиляции
public class Outer {
    int outer_x = 100;

    void test() {
        Inner iner = new Inner();
        iner.display();
    }

    // это внутренний класс
    class Inner {
        int y = 100;   //у - локальная переменная класса Inner

        void display() {
            System.out.println("вывoд: outer_x=" + outer_x);
        }
    }

//       void showy() {                   //ошибка, здесь переменная
//        System.out.println(y);       //у недоступна!
}

