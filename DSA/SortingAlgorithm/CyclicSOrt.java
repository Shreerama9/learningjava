package DSA.SortingAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicSOrt {
    public static void main(String[] args) {
        int [] UnArr = {9,5,3,4,2,6,7,1,8};
        cycsort(UnArr);
        System.out.println(Arrays.toString(UnArr));
    }

    static void cycsort(int [] arr){
        int i = 0;
        while (i<arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap (arr,i,correctIndex);
            }else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
