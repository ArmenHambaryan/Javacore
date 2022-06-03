package Homework.arrayutil;

public class ArrayUtil {

    void arraylenght() {
        int[] array = {126, 461, 55, 67, 98, 101, 12, 45, 502};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    int amount(int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            a = a + array[i];
        }
        return a;
    }

    double arithmetic(int[] array) {
        double b = 0;
        for (int i = 0; i < array.length; i++) {
            b = b + array[i] / array.length;
        }
        return b;
    }

    void evens(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("evens " + array[i]);

            }
        }
    }

    void odd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("odd " + array[i]);
            }
        }
    }

    int countofevens(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                k++;
            }
        }
        return k;
    }

    int countofodd(int[] array) {
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                c++;
            }
        }
        return c;
    }

    void sort(int[] numbers) {
        int num = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    num = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = num;

                }
            }
            System.out.print(numbers[i] + " ");
        }

    }

    void sort1(int[] numbers) {
        int num = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    num = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = num;

                }
            }
            System.out.print(numbers[i] + " ");
        }
    }
}
