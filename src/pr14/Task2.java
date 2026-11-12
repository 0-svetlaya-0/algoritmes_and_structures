package pr14;
import java.util.regex.*;

public class Task2 {
    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        Pattern p = Pattern.compile(regex);

        String[] tests = {
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340",
                "abcdefghijklmnopqrstuv18340extra"
        };

        for (String s : tests) {
            boolean ok = p.matcher(s).matches();
            if (ok){System.out.print(s + " совпадает с паттерном\n");}
            else {System.out.print(s + " не совпадает с паттерном\n");}
        }
    }
}