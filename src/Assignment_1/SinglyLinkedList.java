package Assignment_1;

public class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Q5: Concatenate two lists
    public static Node concatenate(Node list1, Node list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        Node current = list1;
        while (current.next != null) {
            current = current.next;
        }
        current.next = list2;
        return list1;
    }

    // Q6: Rotate list right by k places
    public void rotateRight(int k) {
        if (head == null  head.next == null  k == 0) {
            return;
        }

        // Calculate length
        int length = 1;
        Node current = head;
        while (current.next != null) {
            length++;
            current = current.next;
        }

        // Make circular temporarily
        current.next = head;
        k = k % length;
        int stepsToNewHead = length - k;

        // Find new head
        Node newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        // Update head and break circle
        head = newTail.next;
        newTail.next = null;
    }

    // Q8-9: Search element and return position
    public int search(int value) {
        Node current = head;
        int position = 0;

        while (current != null) {
            if (current.data == value) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1;
    }

    // Q10: Remove at specific position
    public void removeAtPosition(int position) {
        if (head == null) {
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            return;
        }

        current.next = current.next.next;
    }

    // Helper methods
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}