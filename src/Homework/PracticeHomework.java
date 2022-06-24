package Homework;

public class PracticeHomework {
    long convert(int minutes) {
        minutes = minutes * 60;
        return minutes;
        // return minutes*60;
    }

    int calcage(int years) {
        years = years * 365;
        return years;
        //return years*365;
    }

    int nextnumber(int numbers) {
        numbers = numbers + 1;
        return numbers;
        //return numbers+1;
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
            return true;
        //return !value;

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



