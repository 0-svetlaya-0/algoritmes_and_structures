package pr11;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class DateFromInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = sc.nextInt();
        System.out.print("Введите месяц (1-12): ");
        int month = sc.nextInt();
        System.out.print("Введите число: ");
        int day = sc.nextInt();
        System.out.print("Введите часы: ");
        int hour = sc.nextInt();
        System.out.print("Введите минуты: ");
        int minute = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1); // в Calendar месяцы с 0
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, 0);

        Date date = cal.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println("Созданная дата: " + sdf.format(date));
    }
}