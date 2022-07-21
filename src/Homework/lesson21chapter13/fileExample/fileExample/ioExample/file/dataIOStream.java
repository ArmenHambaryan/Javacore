package Homework.lesson21chapter13.fileExample.fileExample.ioExample.file;

import java.io.*;

public class dataIOStream {
    private static final String FILE_PATH="C:\\Users\\lenovo\\IdeaProjects\\JavaCore\\src\\Homework\\lesson21chapter13\\fileExample\\fileExample\\ioExample\\file\\example.txt";

    public static void main(String[] args) throws IOException {
      write();
       read();
    }
    private static void write() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
        out.writeInt(545);
        out.writeBoolean(true);

        out.close();
    }
    private static void read() throws IOException {
        DataInputStream inputStream=new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readBoolean());

        inputStream.close();
    }

}
