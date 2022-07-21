package Homework.lesson21chapter13.fileExample.fileExample.ioExample.file;

import java.io.*;

public class fileReadAndWrite {
    private static final String FILE_PATH = "C:\\Users\\lenovo\\IdeaProjects\\JavaCore\\src\\Homework\\lesson21chapter13\\fileExample\\fileExample\\ioExample\\file\\example.txt";

    public static void main(String[] args) throws IOException {
//        write();
        read();
    }

    private static void read() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = "";
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
            int c;
            int aCount = 0;
            while ((c = bufferedReader.read()) != -1) {
                char a = (char) c;
                if (a == 'a') {
                    aCount++;
                }
                System.out.print(a);
            }
            System.out.println("aCount :"+aCount);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void write() throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH));) {
            bufferedWriter.write("he ll o fr om jav a \r\n");
            bufferedWriter.write("hello from java line 2!!!!!!!!!");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
