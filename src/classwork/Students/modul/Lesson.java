package classwork.Students.modul;

public class Lesson {
    private String name;
    private double price;
    private String teacherName;
    private int duration;

    public Lesson(String name, double price, String teacherName, int duration) {
        this.name = name;
        this.price = price;
        this.teacherName = teacherName;
        this.duration = duration;
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

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", teacherName='" + teacherName + '\'' +
                ", duration=" + duration +
                '}';
    }
}
