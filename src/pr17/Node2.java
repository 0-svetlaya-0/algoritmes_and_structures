package pr17;

import java.util.Scanner;

public class Node2 {
    public String name;
    public Node2 next;
    public Node2 prev;

    public Node2() {}

    public void read(Scanner sc) {
        System.out.print("Введите имя: ");
        this.name = sc.nextLine();
    }

    public void print() {
        System.out.print(name + " <-> ");
    }
}