package pr13;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class WordChain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = sc.nextLine();

        ArrayList<String> words = new ArrayList<>();
        Scanner fileSc = new Scanner(new File(fileName));
        while (fileSc.hasNext()) {
            words.add(fileSc.next());
        }
        fileSc.close();

        if (words.isEmpty()) {
            System.out.println("Файл пуст");
            return;
        }

        ArrayList<String> bestChain = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            ArrayList<String> currentChain = new ArrayList<>();
            ArrayList<String> remaining = new ArrayList<>(words);
            String startWord = remaining.remove(i);
            currentChain.add(startWord);

            findLongestChain(startWord, remaining, currentChain);

            if (currentChain.size() > bestChain.size()) {
                bestChain = new ArrayList<>(currentChain);
            }
        }

        System.out.println("Самая длинная цепочка: " + String.join(" ", bestChain));
    }

    private static void findLongestChain(String current, ArrayList<String> remaining, ArrayList<String> chain) {
        char lastChar = Character.toLowerCase(current.charAt(current.length() - 1));

        for (int i = 0; i < remaining.size(); i++) {
            String next = remaining.get(i);
            char firstChar = Character.toLowerCase(next.charAt(0));

            if (firstChar == lastChar) {
                chain.add(next);
                ArrayList<String> newRemaining = new ArrayList<>(remaining);
                newRemaining.remove(i);

                findLongestChain(next, newRemaining, chain);
            }
        }
    }
}
