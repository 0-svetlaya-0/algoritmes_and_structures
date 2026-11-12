package pr17;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        List3 list = new List3();
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n Кольцевой список ");
            System.out.println("1. Добавить студента");
            System.out.println("2. Удалить студента по имени");
            System.out.println("3. Показать всех");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить на пустоту");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                Node3 newNode = new Node3();
                newNode.read(sc);
                list.add(newNode);
                System.out.println("Студент добавлен");

            } else if (choice == 2) {
                System.out.print("Введите имя для удаления: ");
                String name = sc.nextLine();
                if (list.remove(name)) {
                    System.out.println("Студент удален");
                } else {
                    System.out.println("Студент не найден");
                }

            } else if (choice == 3) {
                list.printAll();

            } else if (choice == 4) {
                list.clear();
                System.out.println("Список очищен.");

            } else if (choice == 5) {
                System.out.println("Список пуст? " + list.isEmpty());

            } else if (choice == 0) {
                System.out.println("Выход");

            } else {
                System.out.println("Неверный ввод, попробуйте снова");
            }
        }
        sc.close();
    }
}