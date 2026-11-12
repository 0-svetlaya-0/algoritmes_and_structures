package pr17;

import java.util.Scanner;

public class Node3 {
    public String name;
    public Node3 next;

    public Node3() {}

    public void read(Scanner sc) {
        System.out.print("Введите имя: ");
        this.name = sc.nextLine();
    }

    public void print() {
        System.out.print(name + " -> ");
    }
}