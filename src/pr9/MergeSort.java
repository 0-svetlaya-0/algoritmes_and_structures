package pr9;

public class MergeSort {
    public static void main(String[] args) {
        Student[] list1 = {
                new Student(5, "Nastya", 4.5),
                new Student(1, "Ivan", 3.2),
                new Student(9, "Alexander", 5.0)
        };

        Student[] list2 = {
                new Student(7, "Polina", 4.8),
                new Student(2, "Maria", 3.9),
                new Student(3, "Svetlana", 4.7)
        };

        System.out.println("Первый список:");
        printArray(list1);
        System.out.println("\nВторой список:");
        printArray(list2);

        Student[] mergedList = mergeAndSort(list1, list2);

        System.out.println("\nОбъединенный и отсортированный список (по ID):");
        printArray(mergedList);
    }

    public static Student[] mergeAndSort(Student[] a, Student[] b) {
        Student[] result = new Student[a.length + b.length];

        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);

        mergeSort(result);

        return result;
    }

    private static void mergeSort(Student[] array) {
        if (array.length < 2) {
            return;
        }

        int mid = array.length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[array.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    private static void merge(Student[] result, Student[] left, Student[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }
    }
    public static void printArray(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }
}