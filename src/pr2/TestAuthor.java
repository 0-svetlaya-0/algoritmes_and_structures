package pr2;

public class TestAuthor {
    public static void main(String[] args) {
        Author gogol = new Author("Nikolay", "nicolasha@gmail.com", 'm');

        System.out.println("Автор: " + gogol);
        System.out.println("Имя:" + gogol.getName());
        System.out.println("Почта: " + gogol.getEmail());
        gogol.setEmail("nikolay1809@gmail.com");
        System.out.println("Новая почта: " + gogol.getEmail());
        System.out.println("Гендер: " + gogol.getGender());
    }
}
