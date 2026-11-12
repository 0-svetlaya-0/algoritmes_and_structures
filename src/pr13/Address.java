package pr13;
import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public void parseWithSplit(String str) {
        String[] parts = str.split(",");
        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].trim();
        }
        country = parts[0];
        region = parts[1];
        city = parts[2];
        street = parts[3];
        house = parts[4];
        building = parts[5];
        apartment = parts[6];
    }

    public void parseWithTokenizer(String str) {
        StringTokenizer st = new StringTokenizer(str, ",.;-");
        country = st.nextToken().trim();
        region = st.nextToken().trim();
        city = st.nextToken().trim();
        street = st.nextToken().trim();
        house = st.nextToken().trim();
        building = st.nextToken().trim();
        apartment = st.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("split (только запятые)");
        String splitTest = "Россия, Московская область, Москва, Тверская, 1, 2, 3";
        Address a1 = new Address();
        a1.parseWithSplit(splitTest);
        System.out.println(a1);
        System.out.println();

        System.out.println("StringTokenizer (разные разделители)");
        String[] tokenizerTests = {
                "Россия; Ленинградская область; Санкт-Петербург; Невский проспект; 10; 1; 5",
                "Беларусь. Минская область. Минск. Пушкина. 7. 3. 12",
                "Россия - Московская область - Серигиев Посад - проспект Красной Армии - 138 - 2 - 50"
        };

        for (String test : tokenizerTests) {
            Address a2 = new Address();
            a2.parseWithTokenizer(test);
            System.out.println(a2);
        }
    }
}