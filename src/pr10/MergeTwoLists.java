package pr10;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeTwoLists {
    public static Student[] mergeTwoSortedLists(Student[] list1, Student[] list2) {
        Student[] result = new Student[list1.length + list2.length];

        int i = 0; // Указатель для list1
        int j = 0; // Указатель для list2
        int k = 0; // Указатель для result

        while (i < list1.length && j < list2.length) {
            if (list1[i].getLastName().compareToIgnoreCase(list2[j].getLastName()) <= 0) {
                result[k] = list1[i];
                i++;
            } else {
                result[k] = list2[j];
                j++;
            }
            k++;
        }

        while (j < list2.length) {
            result[k] = list2[j];
            j++;
            k++;
        }

        while (i < list1.length) {
            result[k] = list1[i];
            i++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        Student[] list1 = {
                new Student("Liza", "Fedik", "Math", 3, "KKSO"),
                new Student("Oleg", "Karanovskiy", "Physics", 4, "BISO"),
                new Student("Nastya", "Oslopova", "IT", 1, "KVBO")
        };

        Student[] list2 = {
                new Student("Insaf", "Husainov", "IT", 2, "KVBO"),
                new Student("Egor", "Trifanov", "IT", 2, "KVBO")
        };

        System.out.println("--- Первый список ---");
        for (Student s : list1) System.out.println(s);

        System.out.println("\n--- Второй список ---");
        for (Student s : list2) System.out.println(s);

        Student[] mergedList = mergeTwoSortedLists(list1, list2);

        System.out.println("\n--- Объединенный отсортированный список ---");
        for (Student s : mergedList) System.out.println(s);
    }

}