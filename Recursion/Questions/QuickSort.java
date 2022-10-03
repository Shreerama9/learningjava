package Recursion.Questions;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = { 1, 9, 3, 3, 4, 6 };
        quickSort(arr2, 0, arr2.length - 1);
        System.out.println(Arrays.toString(arr2));

    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while (s <= e) {
            while (pivot > arr[s]) {
                s++;
            }
            while (pivot < arr[e]) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;

            }
        }
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }

}