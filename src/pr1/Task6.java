package pr1;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда: ");
        double harmonicSum = 0.0;

        for (int i = 1; i <= 10; i++){
            harmonicSum += 1.0/i;
            System.out.printf("H%d = %.4f%n", i, harmonicSum);
        }
    }
}
