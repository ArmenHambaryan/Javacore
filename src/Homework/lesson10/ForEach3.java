package Homework.lesson10;

public class ForEach3 {
    public static void main(String[] args) {
        int[][] nums = new int[3][5];
        int sum = 0;
        // присвоить значение элементам массива nums
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1) * (j + 1);
            //использовать цикл for в стиле for each для
            //вывода и суммирования значений
            for (int[] x : nums) {
                for (int y : x) {
                    System.out.println("Знaчeниe равно:" + y);
                    sum += y;
                }
            }
            System.out.println("Cyммa: " + sum);
        }
    }
}