package Homework.lesson11;

import javafx.scene.layout.HBox;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    //Это конструктор класса Вох
    //BoxDemo6
   // Box(){
      //  System.out.println("Koнcтpyиpoвaниe объекта Вох");
    //   width=10;
    //    height=20;
      //  depth=15;
   // }
    //BoxDemo3
    // void volume(){
    //   System.out.println("Oбъeм равен");
    // System.out.println(width*height*depth);
    //}

    // рассчитать и возвратить объем
    //BoxDemo4
    double volume() {
        return height * width * depth;
    }
    // установить размеры параллелепипеда
    //BoxDemo5

   // void setDim(double w, double h, double d) {
     //   width = w;
  //      height = h;
     //   depth = d;
    }




