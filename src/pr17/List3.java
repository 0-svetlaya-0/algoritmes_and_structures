package pr17;


public class List3 {
    public Node3 head;
    public int size = 0;

    public void add(Node3 newNode) {
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node3 current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    public boolean remove(String name) {
        if (head == null) return false;

        if (head.name.equals(name)) {
            if (size == 1) { head = null; }
            else {
                Node3 last = head;
                while (last.next != head) last = last.next;
                head = head.next;
                last.next = head;
            }
            size--;
            return true;
        }

        Node3 current = head;
        while (current.next != head) {
            if (current.next.name.equals(name)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }
        Node3 current = head;
        do {
            current.print();
            current = current.next;
        } while (current != head);
        System.out.println("(обратно к " + head.name + ")");
    }

    public void clear() { head = null; size = 0; }
    public boolean isEmpty() { return head == null; }
}