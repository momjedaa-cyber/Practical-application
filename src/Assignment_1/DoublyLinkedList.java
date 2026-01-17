
package Assignment_1;

public class DoublyLinkedList {

    // عقدة القائمة الثنائية
    static class DNode {
        int data;
        DNode prev, next;
        DNode(int data) { this.data = data; this.prev = null; this.next = null; }
    }

    private DNode head, tail;

    // سؤال 11: إزالة التكرارات
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

    // سؤال 12: الاجتياز العكسي وطباعة العناصر
    public void traverseReverse() {
        DNode current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // سؤال 13: البحث عن عنصر
    public DNode search(int value) {
        DNode current = head;
        while (current != null) {
            if (current.data == value) return current;
            current = current.next;
        }
        return null;
    }
}