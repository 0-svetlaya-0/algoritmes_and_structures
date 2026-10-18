package pr3;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usdToRub = 83.62;
        double eurToRub = 93.72;
        double cnyToRub = 12.49;

        System.out.println("Конвертер валют");
        System.out.println("Курсы: 1 USD = " + usdToRub + " RUB");
        System.out.println("       1 EUR = " + eurToRub + " RUB");
        System.out.println("       1 CNY = " + cnyToRub + " RUB");
        System.out.println();

        System.out.print("Введите сумму: ");
        double amount = scanner.nextDouble();

        System.out.print("Из какой валюты (RUB, USD, EUR, CNY): ");
        String from = scanner.next().toUpperCase();

        System.out.print("В какую валюту (RUB, USD, EUR, CNY): ");
        String to = scanner.next().toUpperCase();

        double inRub = amount;
        if (from.equals("USD")) {
            inRub = amount * usdToRub;
        } else if (from.equals("EUR")) {
            inRub = amount * eurToRub;
        } else if (from.equals("CNY")) {
            inRub = amount * cnyToRub;
        } else if (!from.equals("RUB")) {
            System.out.println("Неизвестная валюта: " + from);
            return;
        }

        double result = inRub;
        if (to.equals("USD")) {
            result = inRub / usdToRub;
        } else if (to.equals("EUR")) {
            result = inRub / eurToRub;
        } else if (to.equals("CNY")) {
            result = inRub / cnyToRub;
        } else if (!to.equals("RUB")) {
            System.out.println("Неизвестная валюта: " + to);
            return;
        }

        System.out.println();
        System.out.printf("%.2f %s = %.2f %s%n", amount, from, result, to);

        scanner.close();
    }
}
