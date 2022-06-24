package Homework.lesson11chapter6;

public class Stake {
    int[] array = new int[10];
    int index;

    // инициализировать вершину стека
    Stake() {
        index = -1;
    }

    void push(int value) {
        if (index == 9) {
            System.out.println("Stake is full");
        } else {
            {
                array[++index] = value;
            }
        }
    }

    int pop() {
        if (index < 0) {
            System.out.println("stake is empty");
            return 0;
        } else
            return array[index--];

    }
}
