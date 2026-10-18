package pr2;
import java.util.List;
import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        System.out.print("Сколько компьютеров добавить? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nКомпьютер №" + (i + 1));
            System.out.print(" Название: ");
            String name = scanner.nextLine();

            System.out.print("Процессор: ");
            String cpu = scanner.nextLine();

            System.out.print("ОЗУ (ГБ): ");
            int ram = scanner.nextInt();

            System.out.print("SSD (ГБ): ");
            int ssd = scanner.nextInt();

            System.out.print("Цена (руб.): ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            shop.addComputer(new Computer(name, cpu, ram, ssd, price));
        }

        System.out.println();
        shop.printAll();

        System.out.print("\nВведите название для поиска: ");
        String searchName = scanner.nextLine();
        Computer found = shop.findComputer(searchName);
        if (found != null) {
            System.out.println("Найден: " + found);
        } else {
            System.out.println("Компьютер не найден.");
        }

        System.out.print("\nВведите максимальную цену для поиска: ");
        double maxPrice = scanner.nextDouble();
        List<Computer> affordable = shop.findByMaxPrice(maxPrice);
        if (affordable.isEmpty()) {
            System.out.println("Нет компьютеров дешевле " + maxPrice + " руб.");
        } else {
            System.out.println("Подходящие компьютеры:");
            for (Computer c : affordable) {
                System.out.println(c);
            }
        }

        scanner.nextLine();
        System.out.print("\nВведите название компьютера для удаления: ");
        String removeName = scanner.nextLine();
        shop.removeComputer(removeName);

        System.out.println();
        shop.printAll();

        scanner.close();
    }
}
