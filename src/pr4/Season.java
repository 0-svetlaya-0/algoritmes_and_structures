package pr4;

public enum Season {
    WINTER(-17.8),
    SPRING(15.5),
    SUMMER(25.0),
    AUTUMN(8.0);

    private final double averageTemp;

    Season(double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public double getAverageTemp() {
        return averageTemp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
