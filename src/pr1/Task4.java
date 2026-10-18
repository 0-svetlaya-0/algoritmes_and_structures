package pr1;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Введите " + size + " целых чисел: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sumWhile = 0;
        int i = 0;
        while (i < numbers.length) {
            sumWhile += numbers[i];
            i++;
        }
        System.out.println("Сумма (While): " + sumWhile);

        int sumDoWhile = 0;
        int j = 0;
        if (numbers.length > 0) {
            do {
                sumDoWhile += numbers[j];
                j++;
            } while(j < numbers.length);
        }
        System.out.println("Сумма (do-while): " + sumDoWhile);

        int max = numbers[0];
        int min = numbers[0];
        for (int k = 0; k < numbers.length; k++){
            if (numbers[k] > max) max = numbers[k];
            if (numbers[k] < min) min = numbers[k];
        }
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }
}
