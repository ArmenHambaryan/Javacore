package classwork.Students.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public  static Date stringToDate(String dateStr){
        Date parse = null;
        try {
            parse = sdf.parse(dateStr);
        } catch (ParseException e) {
            System.out.println("invalid date forma");
        }

        return null;
    }

    public static String dateToString (Date date){
        if (date==null){
            return "";
        }
        return sdf.format(date);
    }
}
