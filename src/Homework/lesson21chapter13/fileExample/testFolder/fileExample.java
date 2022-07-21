package Homework.lesson21chapter13.fileExample.testFolder;

import java.io.File;
import java.io.IOException;

public class fileExample {
    static String filePath = "C:\\Users\\lenovo\\IdeaProjects\\JavaCore\\src\\Homework\\lesson21chapter13\\fileExample\\testFolder\\hello.txt";
    static String newFilePath = "C:\\Users\\lenovo\\IdeaProjects\\JavaCore\\src\\Homework\\lesson21chapter13\\fileExample\\testFolder\\hello3.txt";

    public static void main(String[] args) throws IOException {

        File myfile = new File(filePath);
        boolean b = myfile.renameTo(new File(newFilePath));
        System.out.println(b);

//        System.out.println(myfile.exists());
//        if (!myfile.exists()){
//            myfile.createNewFile();
//            System.out.println(myfile.exists());
//        }
//        System.out.println("isfile: " + myfile.isFile());
//        System.out.println("isDirectory: " + myfile.isDirectory());
//        if (myfile.isDirectory()){
//            File[] files = myfile.listFiles();
//            for (File file : files) {
//                if (file.isDirectory()){
//
//                }
//                System.out.println(file.getName());
//            }
//        }
    }
}
