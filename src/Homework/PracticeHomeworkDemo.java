package Homework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework work = new PracticeHomework();
        System.out.println("secund = " + work.convert(4));
        System.out.println("days = " + work.calcage(1));
        System.out.println("numbers = " + work.nextnumber(2));
        System.out.println(work.isSameNum(10, 10));
        System.out.println(work.lessThanOrEqualToZero(-1));
        System.out.println(work.reverseBool(true));
        int[] array1 = new int[15];
        int[] array2 = new int[200];
        System.out.println(work.maxLenght(array1, array2));
    }
}
