package Homework.lesson9;

public class IfElse {
    public static void main(String[] args) {
        int month = 1;  // april
        String season;// april
        if (month == 12 || month == 1 || month == 2)
            season = "winter";
        else if (month == 3 || month == 4 || month == 5)
            season = "spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "summer";
        else if (month == 9 || month == 10 || month == 11)
            season = "autumn";
        else
            season = "вымышленным месяцам";
        System.out.println("Апрель относится к "+season+".");
    }

}


