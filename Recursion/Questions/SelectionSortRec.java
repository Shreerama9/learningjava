package Recursion.Questions;

import java.util.Arrays;

public class SelectionSortRec {
    public static void main(String[] args) {

        int[] arr3 = { 3, 5, 96, 8, 1 };
        SelecSorRec(arr3, 0, arr3.length, 0);

        System.out.println(Arrays.toString(arr3));

    }

    static int[] selSortRec(int[] arr, int start, int end) {
        if (end == 0) {
            return arr;
        }
        while (start < end) {
            if (arr[start] > arr[start + 1]) {
                int temp = arr[start];
                arr[start] = arr[start + 1];
                arr[start + 1] = temp;
            }
            start = start + 1;
        }

        return selSortRec(arr, start, end - 1);
    }

    static void selectionSortRec(int[] arr, int start, int end, int max) {
        if (end == 0) {
            return;
        }
        if (start < end) {
            if (arr[start] > arr[max]) {
                selectionSortRec(arr, start + 1, end, start);
            } else {
                selectionSortRec(arr, start + 1, end, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[end - 1];
            arr[end - 1] = temp;
            selectionSortRec(arr, 0, end - 1, max);
        }

    }

    static void SelecSorRec(int[] arr, int i, int j, int max) {
        if (j == 0) {
            return;
        }
        if (i < j) {
            if (arr[i] > arr[max]) {
                SelecSorRec(arr, i + 1, j, i);
            } else {
                SelecSorRec(arr, i + 1, j, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[j - 1];
            arr[j - 1] = temp;

            SelecSorRec(arr, 0, j - 1, 0);
        }
    }

}