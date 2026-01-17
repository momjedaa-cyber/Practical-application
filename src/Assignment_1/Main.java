package Assignment_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Data Structure Assignment 1 ===\n");

        // اختبار عمليات المصفوفات
        testArrayOperations();

        // اختبار القوائم المرتبطة
        testLinkedLists();
    }

    public static void testArrayOperations() {
        System.out.println("--- Array Operations ---");

        int[] arr = {1, 2, 3, 4, 5};

        // Q1: Clone array
        int[] cloned = ArrayOperations.cloneArray(arr);
        System.out.println("Q1 - Original: " + Arrays.toString(arr));
        System.out.println("Q1 - Cloned: " + Arrays.toString(cloned));

        // Q2: Remove random element
        int[] afterRandom = ArrayOperations.removeRandomElement(arr);
        System.out.println("Q2 - After random removal: " + Arrays.toString(afterRandom));

        // Q3: Remove specific element
        int[] afterSpecific = ArrayOperations.removeSpecificElement(arr, 3);
        System.out.println("Q3 - After removing '3': " + Arrays.toString(afterSpecific));

        // Q4: Reverse array
        int[] arr2 = {1, 2, 3, 4, 5};
        ArrayOperations.reverseArray(arr2);
        System.out.println("Q4 - Reversed: " + Arrays.toString(arr2));
    }

    public static void testLinkedLists() {
        System.out.println("\n--- Linked List Operations ---");

        // اختبار القائمة المرتبطة الأحادية
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.append(10);
        sll.append(20);
        sll.append(30);

        System.out.println("Q8 - Position of 20: " + sll.search(20));
        System.out.println("Q8 - Position of 99: " + sll.search(99));
    }
}