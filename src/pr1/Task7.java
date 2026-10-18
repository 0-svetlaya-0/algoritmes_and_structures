package pr1;

public class Task7 {
    public static long calculateFactorial(int n) {
        if (n<0) {
            throw new IllegalArgumentException("Число не может быть отрицательным!");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        long fact = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен: " + fact);

        System.out.println("Факториал числа 0 равен: " + calculateFactorial(0));
        System.out.println("Факториал числа 10 равен: " + calculateFactorial(10));
    }
}
