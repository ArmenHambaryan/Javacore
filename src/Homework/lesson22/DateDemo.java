package Homework.lesson22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateDemo {
    static Scanner scanner = new Scanner(System.in);
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) {
        System.out.println("please input date by dd/MM/yyyy  hh:mm");
//        String format = sdf.format(now);
        String dateStr=scanner.nextLine();
        Date parseDate = null;
        try {
            parseDate = sdf.parse(dateStr);
            System.out.println(parseDate);
        } catch (ParseException e) {
            System.out.println("please input date by dd/MM/yyyy  hh:mm ");

        }


    }
}
