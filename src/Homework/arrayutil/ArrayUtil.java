package Homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        //տպել մասիվի բոլոր էլեմենտները;

        int[] array = {126, 461, 55, 67, 98, 101, 12, 45, 502};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min=" + min);


        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max=" + max);


        int a = 0;
        for (int i = 0; i < array.length; i++) {
            a = a + array[i];
        }
        System.out.println(a);


        int b = 0;
        for (int i = 0; i < array.length; i++) {
            b = b + array[i] / array.length;
        }
        System.out.println(b);


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("zuy tver "+array[i]);
            }
        }


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("kent tver" + array[i]);
            }
        }

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                k++;
            }
        }System.out.print("zuygeri qanaky "+k);
        System.out.println();


        int c = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                c++;
            }
        }
        System.out.print("kenteri qanaky "+c);
    }
}
