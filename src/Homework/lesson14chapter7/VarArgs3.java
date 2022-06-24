package Homework.lesson14chapter7;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int...)" + "Количество аргументов: " + v.length + "Содержимое: ");
        for (int i : v) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
    static void vaTest(boolean...v){
        System.out.print("vaTest(boolean ... ) "+"Количество аргументов: "+v.length+"Содержимое: ");
        for (boolean b : v) {
            System.out.print(b+" ");

        }
        System.out.println();
    }
    static void vaTest(String msg,int...v){
        System.out.print("vaтest(String, int ... ) : "+msg+v.length+"Содержимое: ");
        for (int i : v) {
            System.out.print(i+" ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest("Проверка: ",10,20);
        vaTest(true,false,false);
    }
}
