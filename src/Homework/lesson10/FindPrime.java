package Homework.lesson10;

public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isprime;
        num = 14;
        if (num < 2) {
            isprime = false;
        } else
            isprime = true;
        for (int i = 2; i <= num; i++) {
            if ((num % i) == 0){
                isprime=false;
                break;
            }
        }
        if (isprime)
            System.out.println("Пpocтoe число");
        else
        System.out.println("He простое число");
    }
}
