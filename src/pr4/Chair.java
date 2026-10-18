package pr4;

public class Chair extends Furniture {
    private int legsCount;
    private boolean isSoft;

    public Chair(String name, String material, double price, int legsCount, boolean isSoft) {
        super(name, material, price);
        this.legsCount = legsCount;
        this.isSoft = isSoft;
    }

    @Override
    public String getPurpose() {
        return "Предназначен для сидения одного человека.";
    }

    @Override
    public String toString() {
        return super.toString() + ", ножек: " + legsCount + ", мягкий: " + (isSoft ? "да" : "нет");
    }
}