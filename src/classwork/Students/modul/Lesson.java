package classwork.Students.modul;

import java.util.Date;

import static classwork.Students.util.DateUtil.dateToString;

public class Lesson {
    private String name;
    private double price;
    private String teacherName;
    private int duration;
    private Date startDate;

    public Lesson(String name, double price, String teacherName, int duration,Date startDate) {
        this.name = name;
        this.price = price;
        this.teacherName = teacherName;
        this.duration = duration;
        this.startDate = startDate;
    }

    public Lesson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", teacherName='" + teacherName + '\'' +
                ", duration=" + duration +
                ", startDate=" + dateToString(startDate) +
                '}';
    }
}
