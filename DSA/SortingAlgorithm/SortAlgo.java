package DSA.SortingAlgorithm;

import java.util.Arrays;

public class SortAlgo {
    public static void main(String[] args) {
        int[] unsortedArr = {9,5,6,7,23,1,-99,-69,0};
        int[] sortedArr = bubbleSortAlgo(unsortedArr);
        System.out.println(Arrays.toString(sortedArr));


        int[] AlreadysortedArr = {0,1,2,3,4,5,6};
        int[] AlSortedArrResult = bubbleSortAlgo(AlreadysortedArr);
        System.out.println(Arrays.toString(AlreadysortedArr));


    }

    static int [] bubbleSortAlgo(int[] arr){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        boolean swapped =false;
        for (int i = 0;i <  arr.length; i++){

            for(int j = 1;j < arr.length-i; j++){

                if (arr[j]<arr[j-1]){       //Swap Condition
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
                //It is sorted already
            }
        }
        return arr;
    }
}
