package pr11;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        sdf.setLenient(false);

        System.out.print("Введите дату в формате dd.MM.yyyy: ");
        String input = sc.nextLine();

        try {
            Date userDate = sdf.parse(input);
            Date now = new Date();

            System.out.println("Текущая дата: " + sdf.format(now));
            System.out.println("Введённая дата: " + sdf.format(userDate));

            if (userDate.before(now)) {
                System.out.println("Введённая дата раньше текущей");
            } else if (userDate.after(now)) {
                System.out.println("Введённая дата позже текущей");
            } else {
                System.out.println("Даты совпадают");
            }

        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты");
        }
    }
}