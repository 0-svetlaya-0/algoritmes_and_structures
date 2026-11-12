package pr17;

public class List1 {
    public Node1 head;
    public int size = 0;

    public void add(Node1 newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node1 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public boolean remove(String name) {
        if (head == null) return false;
        if (head.name.equals(name)) {
            head = head.next;
            size--;
            return true;
        }
        Node1 current = head;
        while (current.next != null) {
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
        Node1 current = head;
        while (current != null) {
            current.print();
            current = current.next;
        }
        System.out.println("NULL");
    }

    public void clear() { head = null; size = 0; }
    public boolean isEmpty() { return head == null; }
}