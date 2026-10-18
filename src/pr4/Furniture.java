package pr4;

public abstract class Furniture {
    protected String name;
    protected String material;
    protected double price;

    public Furniture(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public abstract String getPurpose();

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s (материал: %s, цена: %.2f руб.)",
                name, material, price);
    }
}