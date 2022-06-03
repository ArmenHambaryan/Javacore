package classwork.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.plus(2, 4));
        System.out.println(myCalculator.minus(2, 4));
        System.out.println(myCalculator.divide(2, 4));
        System.out.println(myCalculator.multiple(2, 4));

    }
}
