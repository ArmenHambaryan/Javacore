package Homework.lesson12chapter7;

public class Box1Demo {
    public static void main(String[] args) {
        // создать параллелепипеды, используя
        // разные конструкторы
        Box1 mybox = new Box1(10, 20, 15);
        Box1 mybox1 = new Box1();
        Box1 mycube = new Box1(7);
        Box1 myclone = new Box1(mybox1);
        // создать копию объекта myboxl
        double vol;
        // получить объем первого параллелепипеда
        vol=mybox.volume();
        System.out.println("Oбъeм myboxl равен "+vol);
       // получить объем второго параллелепипеда
       vol=mybox1.volume();
        System.out.println("Oбъeм myboxl равен "+vol);
        //получить объем куба
        vol=mycube.volume();
        System.out.println("Oбъeм куба равен "+ vol);
        // получить объем клона
        vol=myclone.volume();
        System.out.println("Oбъeм клона равен "+vol);
    }
}
