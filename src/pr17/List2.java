package pr17;

public class List2 {
    public Node2 head;
    public Node2 tail;
    public int size = 0;

    public void add(Node2 newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public boolean remove(String name) {
        Node2 current = head;
        while (current != null) {
            if (current.name.equals(name)) {

                if (current.prev != null) current.prev.next = current.next;
                else head = current.next;

                if (current.next != null) current.next.prev = current.prev;
                else tail = current.prev;

                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printForward() {
        Node2 current = head;
        while (current != null) {
            current.print();
            current = current.next;
        }
        System.out.println("NULL");
    }

    public void printBackward() {
        Node2 current = tail;
        while (current != null) {
            current.print();
            current = current.prev;
        }
        System.out.println("NULL");
    }

    public void clear() { head = null; tail = null; size = 0; }
    public boolean isEmpty() { return head == null; }
}