package classwork;


public class Porcnakan {
    public static void main(String[] args) {
        int a = 0;
        int[] number = {95, 52, 34, 79, 23, 84, 98, 32, 94, 41,};
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length ; j++) {
                if (number[i]>number[j]){
                    a=number[i];
                    number[i]=number[j];
                    number[j]=a;
                }

            }System.out.println(number[i]);

        }

    }
}















