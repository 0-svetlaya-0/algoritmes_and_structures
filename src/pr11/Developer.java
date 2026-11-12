package pr11;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Developer {
    public static void main(String[] args) {
        String surname = "Журавлева";

        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, 2026);
        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 28);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        Date startDate = cal.getTime();

        Date endDate = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Разработчик: " + surname);
        System.out.println("Получено: " + sdf.format(startDate));
        System.out.println("Сдано: " + sdf.format(endDate));
    }
}