package Homework.lesson19chapter12;

public class AppleDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.REDDEL;
        // вывести значение перечислимого типа
        System.out.println(" Знaчeниe ар:" + ap);
        System.out.println();


        // сравнить два значения перечислимого типа
        ap = Apple.GOLDENDEL;
        if (ap == Apple.GOLDENDEL) {
            System.out.println("Переменная ар содержит GoldenDel.\n");
        }
        // применить перечисление для управления
        // оператором switch
         switch (ap){
             case JONATHAN:
                 System.out.println("Copт Jonathan красный");
                 break;
             case GOLDENDEL:
                 System.out.println("Сорт Golden Delicious желтый.");
                 break;
             case REDDEL:
                 System.out.println(" Copт Red Delicious красный.");
                 break;
             case WINESAP:
                 System.out.println("Copт Winesap красный.");
                 break;
             case CORTLAND:
                 System.out.println("Copт Cortland красный.");

         }

    }
}
