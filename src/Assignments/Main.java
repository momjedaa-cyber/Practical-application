package Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Data Structure Assignment 1 ===\n");

        // اختبار المصفوفات
        System.out.println("--- Array Operations ---");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original: " + Arrays.toString(arr));

        // استنساخ
        int[] cloned = ArrayOperations.cloneArray(arr);
        System.out.println("Cloned: " + Arrays.toString(cloned));

        // عكس
        ArrayOperations.reverseArray(arr);
        System.out.println("Reversed: " + Arrays.toString(arr));

        // اختبار القوائم المرتبطة
        System.out.println("\n--- Linked List Operations ---");

        // القائمة الأحادية
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.append(1); sll.append(2); sll.append(3);
        System.out.println("Singly List: " + sll.display());
        System.out.println("Search 2: " + sll.search(2));

        // القائمة الثنائية
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(1); dll.append(2); dll.append(3);
        dll.display();
        dll.traverseReverse();

        // القائمة الدائرية
        CircularLinkedList cll = new CircularLinkedList();
        cll.append(1); cll.append(2); cll.append(3);
        cll.display();
        System.out.println("Search 2: " + cll.search(2));
    }
}