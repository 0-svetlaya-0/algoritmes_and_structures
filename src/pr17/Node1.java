package pr17;

import java.util.Scanner;

public class Node1 {
    public String name;
    public Node1 next;

    public Node1() {}

    public void read(Scanner sc) {
        System.out.print("Введите имя: ");
        this.name = sc.nextLine();
    }

    public void print() {
        System.out.print(name + " -> ");
    }
}