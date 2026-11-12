package pr11;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareListPerformance {
    static final int N = 100000;

    public static void main(String[] args) {
        System.out.println("Сравнение ArrayList и LinkedList (N = " + N + ")\n");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startArray = System.nanoTime();
        for (int i = 0; i < N; i++) arrayList.add(i);
        long endArray = System.nanoTime();

        long startLinked = System.nanoTime();
        for (int i = 0; i < N; i++) linkedList.add(i);
        long endLinked = System.nanoTime();

        System.out.println("Добавление в конец:");
        System.out.println("  ArrayList:  " + (endArray - startArray) + " нс");
        System.out.println("  LinkedList: " + (endLinked - startLinked) + " нс\n");

        startArray = System.nanoTime();
        arrayList.add(N / 2, -1);
        endArray = System.nanoTime();

        startLinked = System.nanoTime();
        linkedList.add(N / 2, -1);
        endLinked = System.nanoTime();

        System.out.println("Вставка в середину (1 элемент):");
        System.out.println("  ArrayList:  " + (endArray - startArray) + " нс");
        System.out.println("  LinkedList: " + (endLinked - startLinked) + " нс\n");

        startArray = System.nanoTime();
        arrayList.remove(N / 2);
        endArray = System.nanoTime();

        startLinked = System.nanoTime();
        linkedList.remove(N / 2);
        endLinked = System.nanoTime();

        System.out.println("Удаление из середины:");
        System.out.println("  ArrayList:  " + (endArray - startArray) + " нс");
        System.out.println("  LinkedList: " + (endLinked - startLinked) + " нс\n");

        int target = N - 100;
        startArray = System.nanoTime();
        arrayList.indexOf(target);
        endArray = System.nanoTime();

        startLinked = System.nanoTime();
        linkedList.indexOf(target);
        endLinked = System.nanoTime();

        System.out.println("Поиск по значению (indexOf):");
        System.out.println("  ArrayList:  " + (endArray - startArray) + " нс");
        System.out.println("  LinkedList: " + (endLinked - startLinked) + " нс");
    }
}