package Recursion;

import java.util.Arrays;

public class mergSor {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 4, 2 };
        // System.out.println(arr.length);

        System.out.println(Arrays.toString(mergSortAlgo(arr)));
    }

    static int[] mergSortAlgo(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergSortAlgo(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergSortAlgo(Arrays.copyOfRange(arr, mid, arr.length));
        return mergeSor(left, right);
    }

    private static int[] mergeSor(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergedArr = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mergedArr[k] = left[i];
                i++;
            } else {
                mergedArr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            mergedArr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mergedArr[k] = right[j];
            j++;
            k++;
        }
        return mergedArr;
    }
}
