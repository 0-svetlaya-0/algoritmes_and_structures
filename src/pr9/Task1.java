package pr9;

public class Task1 {
    public static void insertionSort(Comparable[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].compareTo(key) > 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(5, "Egor", 4.5),
                new Student(2, "Nastya", 3.8),
                new Student(8, "Liza", 4.9),
                new Student(1, "Oleg", 3.2),
                new Student(4, "Insaf", 4.1)
        };

        System.out.println("До сортировки:");
        for (Student s : students) System.out.println(s);

        insertionSort(students);

        System.out.println("\nПосле сортировки по iDNumber (вставками):");
        for (Student s : students) System.out.println(s);
    }
}