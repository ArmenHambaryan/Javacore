package Homework.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        fileSearch();
//        findLines();
//        printSizeOfFile();
//        contentSearch();
        createFileWithContent();

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() throws IOException {
        System.out.println("please input path,filename");
        try {
            String[] path = scanner.nextLine().split(",");
            File file = new File(path[0]);
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File file1 : files) {
                    boolean isExist = file1.getName().equals(path[1]);
                    if (isExist) {
                        System.out.println(isExist);
                        return;
                    } else System.out.println(isExist);
                    return;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please input correct file name");
            fileSearch();
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
// 1 - path թե որ ֆոլդերում ենք փնտրելու
// 2 - keyword - ինչ որ բառ
// Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
// մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("please input path,keyword");
        String[] pathKeyword = scanner.nextLine().split(",");
        File file = new File(pathKeyword[0]);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                if (file1.getName().endsWith(".txt")) {
                    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1.getAbsolutePath()))) {
                        bufferedReader.readLine().equals(pathKeyword[1]);
                        while (bufferedReader.readLine() != null) {

                        }
                        System.out.println(file1.getName());
                    }
                }
            }

        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
// 1 - txtPath txt ֆայլի փաթը
// 2 - keyword - ինչ որ բառ
// տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {
        System.out.println("input txtPath,keyword");
        String[] pathKeyword = scanner.nextLine().split(",");
        try (BufferedReader bf = new BufferedReader(new FileReader(pathKeyword[0]))) {
            String whileRun;
            while ((whileRun = bf.readLine()) != null) {
                String[] s = whileRun.split(" ");
                for (String s1 : s) {
                    if (s1.equals(pathKeyword[1])) {
                        System.out.println(whileRun);
                    }
                }

            }
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
// 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
// ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfFile() {
        System.out.println("please input wich size do you want ");
        String path = scanner.nextLine();
        File file = new File(path);
        File[] files = file.listFiles();
        if (files != null) {
            long size = 0;
            for (File file1 : files) {
                size += file1.length();

            }
            System.out.println(size / 1024 + "kb");

        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
// 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
// 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
// 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
// որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("please input path,filename,content");
        String[] split = scanner.nextLine().split(",");
        File file = new File(split[0], split[1]);
        boolean newFile = file.createNewFile();
        if (newFile) {
            try (BufferedWriter bf = new BufferedWriter(new FileWriter(file.getAbsolutePath()))) {
                bf.write(split[2]);

            }

        }

    }
}

