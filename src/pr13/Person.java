package pr13;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getFullName() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(surname);
        if (name != null && !name.isEmpty()) {
            sb.append(' ').append(name.charAt(0)).append('.');
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            sb.append(patronymic.charAt(0)).append('.');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Трифанов", "Егор", "Дмитриевич");
        Person p2 = new Person("Ослопова", "Анастасия", "");
        Person p3 = new Person("Щеглова", "", "");

        System.out.println(p1.getFullName());
        System.out.println(p2.getFullName());
        System.out.println(p3.getFullName());
    }
}