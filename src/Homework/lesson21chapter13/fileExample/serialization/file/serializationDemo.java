package Homework.lesson21chapter13.fileExample.serialization.file;

import java.io.*;

public class serializationDemo {
    private static final String FILE_NAME="C:\\Users\\lenovo\\IdeaProjects\\JavaCore\\src\\Homework\\lesson21chapter13\\fileExample\\serialization\\file\\Student";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // for writing student object to file

//        Student student = new Student("name","surname",33,"6543","Gyumri");
//
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
//         objectOutputStream.writeObject(student);
//         objectOutputStream.close();


                ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream(FILE_NAME));
        Object object = objectInputStream.readObject();
        Student student = (Student) object;
        System.out.println(student);


    }



}
