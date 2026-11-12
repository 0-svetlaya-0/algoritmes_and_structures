package pr9;

class Student implements Comparable<Student> {
    private String name;
    private int iDNumber;
    private double gpa;

    public Student(int iDNumber, String name, double gpa) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getiDNumber() { return iDNumber; }
    public double getGpa() { return gpa; }
    public String getName() { return name; }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', iDNumber=" + iDNumber + ", gpa=" + gpa + "}";
    }
}