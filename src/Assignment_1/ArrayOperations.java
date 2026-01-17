package Assignment_1;

import java.util.Random;
import java.util.Arrays;

public class ArrayOperations {

    // سؤال 1: استنساخ مصفوفة - صححت اسم الدالة من "clusters" إلى "cloneArray"
    public static int[] cloneArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    // سؤال 2: حذف عنصر عشوائي
    public static int[] removeRandomElement(int[] arr) {
        if (arr.length == 0) return arr;
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    // سؤال 3: حذف عنصر محدد
    public static int[] removeSpecificElement(int[] arr, int element) {
        int count = 0;
        for (int num : arr) {
            if (num == element) count++;
        }
        if (count == 0) return arr.clone();
        int[] newArr = new int[arr.length - count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    // سؤال 4: عكس مصفوفة
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}