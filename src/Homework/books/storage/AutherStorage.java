package Homework.books.storage;


import Homework.books.modul.Auther;

public class AutherStorage {
    private Auther[] array = new Auther[10];
    private int size = 0;

    public void add(Auther auther) {
        if (array.length == size) {
            extend();
        }
        array[size++] = auther;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");
        }

    }

    private void extend() {
        Auther[] temp = new Auther[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    public int getSize() {
        return size;
    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];

            }
            size--;
            System.out.println("auther deleted");
        } else {
            System.out.println("index out of bounds");
        }
    }


    public Auther getAutherByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return null;
    }


}
