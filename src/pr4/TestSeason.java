package pr4;

public class TestSeason {
    public static void main(String[] args) {
        Season favorite = Season.SUMMER;

        System.out.println("Мое любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getAverageTemp() + "C");

        if (favorite == Season.SUMMER) {
            System.out.println("Описание: Теплое время года");
        } else {
            System.out.println("Описание: " + favorite.getDescription());
        }

        System.out.println("\nИнформация о всех сезонах");
        for (Season s : Season.values()) {
            System.out.println(s + ": Температура " + s.getAverageTemp() + "°C");
        }

        System.out.println("\nПроверка switch");
        checkSeason(Season.WINTER);
        checkSeason(Season.SUMMER);
    }

    public static void checkSeason(Season s) {
        switch (s) {
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            default:
                System.out.println("Сейчас " + s + ", не лето.");
        }
    }
}