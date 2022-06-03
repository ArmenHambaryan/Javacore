package Homework;

public class PracticeHomework {
    long convert(int minutes) {
        minutes = minutes * 60;
        return minutes;
    }

    int calcage(int years) {
        years = years * 365;
        return years;
    }

    int nextnumber(int numbers) {
        numbers = numbers + 1;
        return numbers;
    }

    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else
            return false;
    }

    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        } else
            return false;
    }

    boolean reverseBool(boolean value) {
        if (value == true) {
            return false;
        } else
            return false;

    }

    int maxLenght(int[] array1, int[] array2) {
        int max = array1.length;
        if (array1.length > array2.length) {
            max = array1.length;
        } else
            max=array2.length;
        return max;
    }

}



