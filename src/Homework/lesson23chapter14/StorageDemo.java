package Homework.lesson23chapter14;

import classwork.Students.modul.Student;

public class StorageDemo {
    public static void main(String[] args) {

        Storage<Integer> intStorage = new Storage<>();
        intStorage.add(99);

        Storage<String> str = new Storage<>();
        str.add("hallo");
        String string = str.getByIndex(0);


        Storage<Student> studentStorage = new Storage<>();
        Student student = studentStorage.getByIndex(0);



    }
}

