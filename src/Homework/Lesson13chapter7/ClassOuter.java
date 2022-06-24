package Homework.Lesson13chapter7;

// Продемонстрировать применение внутреннего класса
public class ClassOuter {
    int outer_x = 100;

    void test() {
        Inner iner = new Inner();
        iner.display();
    }

    // это внутренний класс
    class Inner {
        void display() {
            System.out.println("bывoд: outer_x" + outer_x);
        }


    }
}

