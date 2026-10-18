package pr4;

public class FurnitureShop {
    private Furniture[] items;
    private int count;

    public FurnitureShop(int capacity) {
        items = new Furniture[capacity];
        count = 0;
    }

    public void addFurniture(Furniture item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        } else {
            System.out.println("Магазин переполнен, нет места для: " + item.getName());
        }
    }

    public void printAll() {
        System.out.println("Ассортимент магазина мебели");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
            System.out.println("  Назначение: " + items[i].getPurpose());
            System.out.println();
        }
    }

    public void findCheaperThan(double maxPrice) {
        System.out.println("Мебель дешевле " + maxPrice + " руб.");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (items[i].getPrice() <= maxPrice) {
                System.out.println(items[i].getName() + " — " + items[i].getPrice() + " руб.");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Ничего не найдено.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(5);

        Chair chair = new Chair("Офисный стул", "кожа", 4500.0, 5, true);
        Table table = new Table("Обеденный стол", "дерево", 15000.0, 1.8, 0.9, true);
        Sofa sofa = new Sofa("Угловой диван", "рогожка", 35000.0, 4);

        shop.addFurniture(chair);
        shop.addFurniture(table);
        shop.addFurniture(sofa);

        shop.printAll();
        shop.findCheaperThan(20000.0);
    }
}