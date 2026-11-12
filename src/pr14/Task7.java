package pr14;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$";
        Pattern p = Pattern.compile(regex);

        String[] passwords = {
                "F032_Password",
                "TrySpy1",
                "smart_pass",
                "A007"
        };

        for (String pass : passwords) {
            boolean isReliable = p.matcher(pass).matches();
            if (isReliable) {System.out.println(pass + " надежный пароль");}
            else {System.out.println(pass + " ненадежный пароль");}
        }
    }
}