package pr4;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Неизвестно";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " идет.");
    }

    public void talk() {
        System.out.println(fullName + " говорит.");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Полина Щеглова", 18);

        p1.talk();
        p1.move();

        p2.talk();
        p2.move();
    }
}