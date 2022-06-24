package Homework.Lesson13chapter7;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack = new Stack();
        Stack mystack2 = new Stack();

        // разместить числа в стеке
        for (int i = 0; i < 10; i++) mystack.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Стек в mystack1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack.pop());
        }
        System.out.println("Стек в mystack2: ");
        for (int i = 10; i <20 ; i++) {
            System.out.println(mystack2.pop());
//             эти операторы недопустимы
//             mystackl.tos = -2;
//             mystack2.stck[3] = 100;

        }
    }


}
