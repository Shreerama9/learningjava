package Recursion.Questions;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 8, 1 };
        bubbleSortRec(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSortRec(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (row > col) {
            if (arr[col] > arr[col + 1]) {
                int tmp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = tmp;
            }
            bubbleSortRec(arr, row, col + 1);
        } else {
            bubbleSortRec(arr, row - 1, 0);
        }
    }

}
