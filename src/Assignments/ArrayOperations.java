package Arrays;

import java.util.*;

public class ArrayOperations {

    // السؤال 1: استنساخ مصفوفة
    public static int[] cloneArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    // السؤال 2: حذف عنصر عشوائي
    public static int[] removeRandomElement(int[] arr) {
        if (arr.length == 0) return arr;
        Random rand = new Random();
        int index = rand.nextInt(arr.length);

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) newArr[j++] = arr[i];
        }
        return newArr;
    }

    // السؤال 3: حذف عنصر محدد
    public static int[] removeSpecificElement(int[] arr, int element) {
        int count = 0;
        for (int num : arr) if (num == element) count++;

        if (count == 0) return arr.clone();

        int[] newArr = new int[arr.length - count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != element) newArr[j++] = arr[i];
        }
        return newArr;
    }

    // السؤال 4: عكس مصفوفة
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}