package Homework.lesson12chapter7;

public class OverLoad1 {
    public static void main(String[] args) {
        OverLoadDemo1 ol1=new OverLoadDemo1();
        int i = 88;
        ol1.test();
        ol1.test(10,20);
        ol1.test(i);                     // здесь вызывается вариант
                                          //метода test(douЬle)
        ol1.test(123.2);              //и здесь вызывается вариант
                                         //  метода test(douЬle)
    }
}
