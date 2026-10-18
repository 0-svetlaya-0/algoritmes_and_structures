package pr2;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер добавлен: " + computer.getName());
    }

    public boolean removeComputer(String name) {
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getName().equalsIgnoreCase(name)) {
                computers.remove(i);
                System.out.println("Компьютер \"" + name + "\" удалён.");
                return true;
            }
        }
        System.out.println("Компьютер \"" + name + "\" не найден.");
        return false;
    }

    public Computer findComputer(String name) {
        for (Computer c : computers) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public List<Computer> findByMaxPrice(double maxPrice) {
        List<Computer> result = new ArrayList<>();
        for (Computer c : computers) {
            if (c.getPrice() <= maxPrice) {
                result.add(c);
            }
        }
        return result;
    }

    public void printAll() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст.");
            return;
        }
        System.out.println("Список компьютеров в магазине");
        for (Computer c : computers) {
            System.out.println(c);
        }
    }
}
