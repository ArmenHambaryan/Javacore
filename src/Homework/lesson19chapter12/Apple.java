package Homework.lesson19chapter12;
   //Перечисление сортов яблок
public enum Apple {
    JONATHAN(10),
    GOLDENDEL(9),
    REDDEL(12),
    WINESAP(15),
    CORTLAND(8);

     private int price;   // цена яблока каждого сорта

       //Конструктор


       Apple(int price) {
           this.price = price;
       }

       public int getPrice() {
           return price;
       }
   }
