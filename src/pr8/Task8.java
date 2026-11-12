package pr8;

public class Task8 {
    public static boolean isPalindrome(String s){
        if (s.length() <= 1){
            return true;
        }
        String first = s.substring(0, 1);
        String last = s.substring(s.length() - 1);
        if(!first.equals(last)) {
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }
    public static void main(String[] args){
        String word = "hannah";
        if (isPalindrome(word)) {
            System.out.print("YES");
        } else {System.out.print("NO");}
    }
}
