package pr2;

public class Computer {
    private String name;
    private String cpu;
    private int ram;
    private int ssd;
    private double price;
    public Computer(String name, String cpu, int ram, int ssd, double price){
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.price = price;
    }
    public String getName() {return name;}
    public String getCpu() {return cpu;}
    public int getRam() {return ram;}
    public int getSsd() {return ssd;}
    public double getPrice() {return price;}

    @Override
    public String toString() {
        return "Computer{" +
                "название: '" + name + '\'' +
                ", CPU:'" + cpu + '\'' +
                ", RAM: " + ram + "ГБ" +
                ", SSD: " + ssd + "ГБ" +
                ", цена: " + price + "руб." +
                '}';
    }
}

