package classwork;

public class ClassDEmo {
    public int returncenturycentury(double year) {
        if (year % 100 == 0) {
            year = year / 100;
        } else {
            year = (year / 100) + 1;
        }
        return (int) year;
    }
}
