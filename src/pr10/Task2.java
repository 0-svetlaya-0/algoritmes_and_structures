package pr10;

public class Task2 {
    private Student[] students;

    public Task2() {
        this.students = new Student[5];
    }

    public void setArray() {
        students[0] = new Student("Egor", "Trifanov", "IT", 2, "KVBO");
        students[1] = new Student("Nastya", "Oslopova", "IT", 1, "KVBO");
        students[2] = new Student("Liza", "Fedik", "Math", 3, "KKSO");
        students[3] = new Student("Oleg", "Karanovskiy", "Physics", 4, "BISO");
        students[4] = new Student("Insaf", "Husainov", "IT", 2, "KVBO");
    }

    public void outArray() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void mergeSort() {
        if (students.length < 2) return;
        mergeSortRecursive(students);
    }

    private void mergeSortRecursive(Student[] array) {
        if (array.length < 2) return;

        int mid = array.length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[array.length - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        mergeSortRecursive(left);
        mergeSortRecursive(right);

        merge(array, left, right);
    }

    private void merge(Student[] result, Student[] left, Student[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].getLastName().compareToIgnoreCase(right[j].getLastName()) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        Task2 app = new Task2();

        app.setArray();
        System.out.println("--- До сортировки ---");
        app.outArray();

        app.mergeSort();
        System.out.println("\n--- После сортировки слиянием (по фамилии) ---");
        app.outArray();
    }
}