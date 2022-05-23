package Homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        int num = 0;
        int[] numbers = {43, 55, 5, -9, 0, 12, 6, 65};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    num = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = num;
                }

            }System.out.println(numbers[i]);
        }
    }
}
