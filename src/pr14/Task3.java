package pr14;
import java.util.regex.*;

public class Task3 {
    public static void main(String[] args) {
        String text = "Товар A стоит 25.98 USD, товар B — 1000 RUB, товар C — 44 ERR, а товар D — 0.004 EU.";

        String regex = "\\d+(\\.\\d+)?\\s?(USD|RUB|EUR)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        System.out.println("Найденные цены:");
        while (m.find()) {
            System.out.println("  " + m.group());
        }
    }
}