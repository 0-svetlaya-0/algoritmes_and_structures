package pr4;

public class Sofa extends Furniture {
    private int seatsCount;

    public Sofa(String name, String material, double price, int seatsCount) {
        super(name, material, price);
        this.seatsCount = seatsCount;
    }

    @Override
    public String getPurpose() {
        return "Предназначен для отдыха нескольких человек.";
    }

    @Override
    public String toString() {
        return super.toString() + ", мест: " + seatsCount;
    }
}