package pr4;

public class Table extends Furniture {
    private double length;
    private double width;
    private boolean isFolding;

    public Table(String name, String material, double price, double length, double width, boolean isFolding) {
        super(name, material, price);
        this.length = length;
        this.width = width;
        this.isFolding = isFolding;
    }

    @Override
    public String getPurpose() {
        return "Предназначен для работы или приема пищи.";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", размеры: %.1fx%.1f м, раскладной: %s",
                length, width, (isFolding ? "да" : "нет"));
    }
}
