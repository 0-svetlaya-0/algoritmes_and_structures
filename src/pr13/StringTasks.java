package pr13;

public class StringTasks {
    public static void main(String[] args) {
        String s = "I like Java!!!";

        System.out.println("Исходная строка: " + s);

        System.out.println("Последний символ: " + s.charAt(s.length() - 1));

        System.out.println("Заканчивается на \"!!!\": " + s.endsWith("!!!"));

        System.out.println("Начинается с \"I like\": " + s.startsWith("I like"));

        System.out.println("Содержит \"Java\": " + s.contains("Java"));

        System.out.println("Позиция \"Java\": " + s.indexOf("Java"));

        System.out.println("Замена а на о: " + s.replace('a', 'o'));

        System.out.println("Верхний регистр: " + s.toUpperCase());

        System.out.println("Нижний регистр: " + s.toLowerCase());

        int start = s.indexOf("Java");
        String cut = s.substring(start, start + 4);
        System.out.println("Вырезано: " + cut);
    }
}