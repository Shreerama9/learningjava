package DSA.SortingAlgorithm;

//![](../../../../Pictures/Screenshots/Screenshot from 2022-08-21 14-52-40.png)


import java.util.Arrays;

public class InsertionSortAlgo {
    public static void main(String[] args) {
        int[] unsortedArr = {9,5,6,7,23,1,-99,-69,0};
        int[] sortedArr = inssortarr(unsortedArr);
        System.out.println(Arrays.toString(sortedArr));

    }

    static int[] inssortarr(int[] arr){
        for (int i = 0; i<arr.length-1;i++){
            for (int j = i+1; j > 0; j--){
                if(arr[j]<arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }else {
                    break;
                }
            }
        }
        return arr;
    }

}
