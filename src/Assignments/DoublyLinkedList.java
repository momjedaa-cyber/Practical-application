package Arrays;

class DNode {
    int data;
    DNode prev, next;
    DNode(int data) { this.data = data; this.prev = null; this.next = null; }
}

public class DoublyLinkedList {
    private DNode head, tail;

    // السؤال 11: إزالة التكرارات
    public void removeDuplicates() {
        DNode current = head;
        while (current != null) {
            DNode runner = current.next;
            while (runner != null) {
                if (runner.data == current.data) {
                    if (runner.prev != null) runner.prev.next = runner.next;
                    if (runner.next != null) runner.next.prev = runner.prev;
                    if (runner == tail) tail = runner.prev;
                }
                runner = runner.next;
            }
            current = current.next;
        }
    }

    // السؤال 12: الاجتياز العكسي
    public void traverseReverse() {
        DNode current = tail;
        System.out.print("Reverse: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // السؤال 13: البحث
    public DNode search(int value) {
        DNode current = head;
        while (current != null) {
            if (current.data == value) return current;
            current = current.next;
        }
        return null;
    }

    // طرق مساعدة
    public void append(int data) {
        DNode newNode = new DNode(data);
        if (head == null) { head = tail = newNode; return; }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void display() {
        DNode current = head;
        System.out.print("Doubly List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}