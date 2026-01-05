package Arrays;

class Node {
    int data;
    Node next;

    Node(int data) { this.data = data; this.next = null; }
}

public class SinglyLinkedList {
    private Node head;

    // السؤال 5: دمج قائمتين
    public static Node concatenate(Node list1, Node list2) {
        if (list1 == null) return list2;
        Node current = list1;
        while (current.next != null) current = current.next;
        current.next = list2;
        return list1;
    }

    // السؤال 6: تدوير القائمة
    public void rotateRight(int k) {
        if (head == null  head.next == null  k == 0) return;

        // حساب الطول
        int length = 1;
        Node current = head;
        while (current.next != null) { length++; current = current.next; }

        // جعلها دائرية مؤقتاً
        current.next = head;
        k = k % length;
        int steps = length - k;

        // إيجاد الرأس الجديد
        Node newTail = head;
        for (int i = 1; i < steps; i++) newTail = newTail.next;
        head = newTail.next;
        newTail.next = null;
    }

    // السؤال 8-9: البحث عن عنصر
    public int search(int value) {
        Node current = head;
        int pos = 0;
        while (current != null) {
            if (current.data == value) return pos;
            current = current.next;
            pos++;
        }
        return -1;
    }

    // السؤال 10: حذف من موضع محدد
    public void removeAtPosition(int pos) {
        if (head == null) return;
        if (pos == 0) { head = head.next; return; }

        Node current = head;
        for (int i = 0; i < pos - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next != null) current.next = current.next.next;
    }

    // طرق مساعدة
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) { head = newNode; return; }
        Node current = head;
        while (current.next != null) current = current.next;
        current.next = newNode;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }
}