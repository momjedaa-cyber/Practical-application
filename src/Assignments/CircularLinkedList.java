package Arrays;

class CNode {
    int data;
    CNode next;
    CNode(int data) { this.data = data; this.next = null; }
}

public class CircularLinkedList {
    private CNode head, tail;

    // السؤال 14: إدراج في موضع محدد
    public void insertAtPosition(int pos, int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            tail.next = head;
            return;
        }

        CNode current = head;
        for (int i = 0; i < pos - 1; i++) {
            current = current.next;
            if (current == head) break;
        }
        newNode.next = current.next;
        current.next = newNode;
        if (newNode.next == head) tail = newNode;
    }

    // السؤال 15: حذف من موضع محدد
    public void deleteAtPosition(int pos) {
        if (head == null) return;
        if (head == tail && pos == 0) { head = tail = null; return; }

        if (pos == 0) {
            head = head.next;
            tail.next = head;
            return;
        }

        CNode current = head, prev = null;
        for (int i = 0; i < pos; i++) {
            prev = current;
            current = current.next;
            if (current == head) return;
        }
        prev.next = current.next;
        if (current == tail) tail = prev;
    }

    // السؤال 16: البحث
    public int search(int value) {
        if (head == null) return -1;
        CNode current = head;
        int pos = 0;
        do {
            if (current.data == value) return pos;
            current = current.next;
            pos++;
        } while (current != head);
        return -1;
    }

    // السؤال 17: تقسيم القائمة
    public CircularLinkedList[] splitList() {
        CircularLinkedList[] halves = new CircularLinkedList[2];
        halves[0] = new CircularLinkedList();
        halves[1] = new CircularLinkedList();

        if (head == null || head.next == head) {
            halves[0].head = head;
            return halves;
        }

        CNode slow = head, fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        halves[0].head = head;
        halves[0].tail = slow;
        halves[1].head = slow.next;
        halves[1].tail = tail;

        halves[0].tail.next = halves[0].head;
        halves[1].tail.next = halves[1].head;

        return halves;
    }

    // طرق مساعدة
    public void append(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void display() {
        if (head == null) { System.out.println("Empty list"); return; }
        CNode current = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}