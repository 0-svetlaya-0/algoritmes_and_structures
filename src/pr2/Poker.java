package pr2;
import java.util.Scanner;
import java.util.Random;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();

        if (n <= 0 || n > 10) {
            System.out.println("Некорректное число игроков!");
            return;
        }

        String[] deck = createDeck();
        int deckSize = deck.length;
        Random rand = new Random();

        for (int i = 1; i <= n; i++) {
            System.out.println("Игрок " + i + ":");
            for (int j = 0; j < 5; j++) {
                int index = rand.nextInt(deckSize);

                System.out.println("  " + deck[index]);

                deck[index] = deck[deckSize - 1];
                deckSize--;
            }
            System.out.println();
        }

        scanner.close();
    }

    static String[] createDeck() {
        String[] suits = {"Пики", "Черви", "Бубны", "Трефы"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Дама", "Король", "Туз"};
        String[] deck = new String[52];
        int k = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[k++] = rank + " " + suit;
            }
        }
        return deck;
    }
}
