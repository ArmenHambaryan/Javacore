package Homework.lesson11;

public class BoxDemo7 {
    public static void main(String[] args) {
        // объявить, выделить память и инициализировать
        // объекты типа Вох
        Box myBox1=new Box(10,20,15);
        Box myBox2=new Box(3,6,9);

        double vol;

        //получить объем первого параллелепипеда
        vol= myBox1.volume();
        System.out.println(vol);

        // получить объем второго параллелепипеда
        vol= myBox2.volume();
        System.out.println(vol);



    }
}
