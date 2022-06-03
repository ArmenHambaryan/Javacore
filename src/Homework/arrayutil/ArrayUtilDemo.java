package Homework.arrayutil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil myArrayutil1 = new ArrayUtil();
        myArrayutil1.arraylenght();


        int[] array1 = {126, 461, 55, 67, 98, 101, 12, 45, 502};
        ArrayUtil max = new ArrayUtil();
        System.out.println("max =" + max.max(array1));

        int[] array = {126, 461, 55, 67, 98, 101, 12, 45, 502};
        ArrayUtil min = new ArrayUtil();
        System.out.println("min=" + min.min(array));


        int[] array2 = {126, 461, 55, 67, 98, 101, 12, 45, 502};
        ArrayUtil sum = new ArrayUtil();
        System.out.println("sum =" + sum.amount(array2));


        int[] array3 = {126, 461, 55, 67, 98, 101, 12, 45, 502};
        ArrayUtil arithmetic = new ArrayUtil();
        System.out.println("arithmetic=" + arithmetic.arithmetic(array3));

        int[] array4 = {126, 461, 55, 67, 98, 101, 12, 45, 502};
        ArrayUtil evens = new ArrayUtil();
        evens.evens(array4);


        int[] array5 = {126, 461, 55, 67, 98, 101, 12, 45, 502};
        ArrayUtil odd = new ArrayUtil();
        odd.odd(array5);

        int[] array6 = {126, 461, 55, 67, 98, 101, 12, 45, 502};
        ArrayUtil countofevens = new ArrayUtil();
        System.out.println("countofevens = " + countofevens.countofevens(array6));

        int[] array7 = {126, 461, 55, 67, 98, 101, 12, 45, 502};
        ArrayUtil countofodds = new ArrayUtil();
        System.out.println("countofodds = " + countofodds.countofodd(array7));

        int[] array8 = {126, 461, 55, 67, 98, 101, 12, 45, 502};
        ArrayUtil sort = new ArrayUtil();
        sort.sort(array8);

        System.out.println();

        int[] array9 = {126, 461, 55, 67, 98, 101, 12, 45, 502};
        ArrayUtil sort1 = new ArrayUtil();
        sort1.sort1(array9);
    }


}
