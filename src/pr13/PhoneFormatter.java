package pr13;

public class PhoneFormatter {
    public static String format(String phone) {
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < phone.length(); i++) {
            char c = phone.charAt(i);
            if (c >= '0' && c <= '9') {
                digits.append(c);
            }
        }

        String num = digits.toString();

        if (num.length() == 11 && num.charAt(0) == '8') {
            num = "7" + num.substring(1);
        }

        String country = num.substring(0, 1);
        String p1 = num.substring(1, 4);
        String p2 = num.substring(4, 7);
        String p3 = num.substring(7, 11);

        return "+" + country + " " + p1 + " " + p2 + "-" + p3.substring(0, 2) + "-" + p3.substring(2);
    }

    public static void main(String[] args) {
        System.out.println(format("+79175655655"));
        System.out.println(format("89175655655"));
        System.out.println(format("+104289652211"));
    }
}