package pr9;
import java.util.Comparator;

public class Task2 {

    public static void quickSort(Student[] arr, int low, int high, Comparator<Student> cmp) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high, cmp);
            quickSort(arr, low, pivotIndex - 1, cmp);
            quickSort(arr, pivotIndex + 1, high, cmp);
        }
    }

    private static int partition(Student[] arr, int low, int high, Comparator<Student> cmp) {
        Student pivot = arr[high]; // опорный — последний элемет
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (cmp.compare(arr[j], pivot) < 0) {
                i++;
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Student temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(5, "Egor",  4.5),
                new Student(2, "Nastya", 3.8),
                new Student(8, "Liza", 4.9),
                new Student(1, "Oleg", 3.2),
                new Student(4, "Insaf", 4.1)
        };

        System.out.println("До сортировки:");
        for (Student s : students) System.out.println(s);

        SortingStudentsByGPA cmp = new SortingStudentsByGPA();
        quickSort(students, 0, students.length - 1, cmp);

        System.out.println("\nПосле сортировки по GPA (убывание, Quick Sort):");
        for (Student s : students) System.out.println(s);
    }
}