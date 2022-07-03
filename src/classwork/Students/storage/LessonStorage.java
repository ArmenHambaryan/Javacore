package classwork.Students.storage;

import classwork.Students.modul.Lesson;


public class LessonStorage {
    private Lesson[] array = new Lesson[10];
    private int size = 0;

    public void add(Lesson lesson) {
        if (array.length == size) {
            extend();
        }
        array[size++] =lesson;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i] + " ");
        }
    }

    private void extend() {
        Lesson[] temp = new Lesson[array.length + 10];
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
            System.out.println("lesson deleted");
        } else {
            System.out.println("index out of bounds");
        }
    }

public Lesson getLessonByIndex(int index){
    if (index >= 0 && index < size){
        return array[index];
    }
    return null;
}

}
