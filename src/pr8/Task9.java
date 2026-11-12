package pr8;

public class Task9 {
    public static int countSequences(int a, int b) {
        if (a>b+1) {
            return 0;
        }
        if (a==0) {
            return 1;
        }
        return countSequences(a, b-1) + countSequences(a-1, b-1);
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.print(countSequences(a, b));
    }
}
