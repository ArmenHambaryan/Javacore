package Homework.lesson11chapter6;

public class TestStake {
    public static void main(String[] args) {
        Stake stake = new Stake();
        stake.push(6);
        stake.push(4);
        stake.push(8);
        System.out.println(stake.pop());
        System.out.println(stake.pop());
        stake.push(6);
        System.out.println(stake.pop());
        System.out.println(stake.pop());
        System.out.println(stake.pop());
    }
}
