package Homework.Lesson13chapter7;

// В этом классе определяется целочисленный стек,
// который может содержать 10 значений
public class Stack {
    /* Теперь переменные stack и tos являются закрытыми.
    Это означает, что они не могут быть случайно или
    намеренно изменены таким образом, чтобы нарушить стек */
    private int[] stack = new int[10];
    private int index;

     // инициализировать вершину стека
    Stack(){
        index=-1;
    }
    //разместить элемент в стеке
    void push(int intem){
        if (index==9)
            System.out.println("Cтeк заполнен.");
        else
            stack[++index]=intem;
}
//извлечь элемент из стека
    int pop() {
        if (index < 0){
            System.out.println("Cтeк не загружен.");
        return 0;
        }
        else
            return stack[--index];
    }
}
