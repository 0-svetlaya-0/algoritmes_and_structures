package pr1;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15};
        double sum = 0;

        for (int i = 1; i<numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum/numbers.length;

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}
