package Homework;

public class DinamicArrayTest {
    public static void main(String[] args) {
      DynamicArray array =new DynamicArray();
      array.add(56);
      array.add(45);
      array.add(3);
      array.add(7);
      array.add(8);
      array.add(90);
      array.add(12);
      array.add(34);
      array.add(54);
      array.printArray();
//      array.set(1,96);
//        array.add(1,98);
//        array.delete(1);
//        System.out.println(array.isEmpty());
//        System.out.println(array.getByIndex(3));
        System.out.println(array.getFirstIndexByValue(7));
        array.printArray();

    }
}
