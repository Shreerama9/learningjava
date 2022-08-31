package DSA.SortingAlgorithm;

import static DSA.SortingAlgorithm.MissingNumCyclic.swap;

public class JavaMissNumCycSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 0};
        int sol = missingNumber(arr);
        System.out.println(sol);


    }

    public static int missingNumber(int[] arr) {
            int i = 0;
        int correct = arr.length;
        while (i <correct ) {
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct );
            }else {
                i++;
            }
            for (int j : arr){
                if(arr[j] != j){
                    return j;
                }
            }
        }
        return correct;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}