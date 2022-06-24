package Homework.Lesson13chapter7;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();
        //Эти операторы правильны, поэтому члены а и Ь
        //данного класса доступны непосредственно
        ob.a=10;
        ob.b=20;

        // Этот оператор неверен и может вызвать ошибку
        // оЬ.с 100; //ОШИБКА!

        //Доступ к члену с данного класса должен
        // осуществляться с помощью методов его класса
        ob.sect(100);  //ВЕРНО!
        System.out.println("a, Ь, и с: "+ob.a+" "+ob.b+" "+ob.getc());
    }


}
