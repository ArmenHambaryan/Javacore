package Homework.BraceChecker;

public class Stake {
    private int[] array = new int[10];
    private int index;

    // инициализировать вершину стека
    Stake() {
        index = -1;
    }

    public void push(int x) {
        if (index == 9) {
            System.out.println("stake is full");
        } else {
            array[++index] = x;

        }
    }

    public int pop() {
        if (index < 0) {
            System.out.println("stake is Empty");
            return 0;
        } else {
            return array[index--];

        }


    }

    public boolean isEmpty() {return index == -1;}
}
