package pr11;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Student {
    private String name;
    private int iDNumber;
    private double gpa;
    private Date birthDate;

    public Student(String name, int iDNumber, double gpa, Date birthDate) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.gpa = gpa;
        this.birthDate = birthDate;
    }

    public String getBirthDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(birthDate);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return name + " (ID: " + iDNumber + ", GPA: " + gpa +
                ", дата рождения: " + sdf.format(birthDate) + ")";
    }

    public static void main(String[] args) {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2007, Calendar.NOVEMBER, 3);
        Date birth = cal.getTime();

        Student s = new Student("Щеглова", 103, 4.5, birth);

        System.out.println("toString(): " + s);
        System.out.println("Короткий формат: " + s.getBirthDate("dd.MM.yy"));
        System.out.println("Средний формат:  " + s.getBirthDate("dd MMM yyyy"));
        System.out.println("Полный формат:   " + s.getBirthDate("EEEE, d MMMM yyyy"));
    }
}