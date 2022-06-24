package Homework.lesson12chapter7;

public class Box1 {
    // В этой версии класса Вох один объект допускается
     // инициализировать другим объектом
    double widht;
    double heigth;
    double depth;
    //Обратите внимание на этот конструктор. В качестве
    //параметра в нем используется объект типа Вох
    Box1(Box1 ob){//передать объект конструктору
        widht=ob.widht;
        heigth=ob.heigth;
        depth=ob.depth;
    }
    // конструктор, используемый, когда
    //указываются все размеры
    Box1(double w, double h, double d){
        widht=w;
        heigth=h;
        depth=d;
    }
    // конструктор, используемый, если ни один из
    //размеров не указан
    Box1(){
        widht=-1;                   // использовать значение -1 для обозначения неинициализированного
        heigth=-1;                   // параллелепипеда
        depth=-1;
    }
    //конструктор, используемый при создании куба
    Box1(double len){
        widht=heigth=depth=len;
    }
    //рассчитать и возвратить объем
    double volume (){
        return heigth*depth*widht;
    }
}
