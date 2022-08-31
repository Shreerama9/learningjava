package DSA.BinarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr2D = {{10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int[] locof37 = search(arr2D,37);
        System.out.println(Arrays.toString(locof37));
        int[] locof49 = search(arr2D,49);
        System.out.println(Arrays.toString(locof49));
    }
    static int[] search(int[][] arr, int target){
        int row = 0;
        int col = arr.length-1;
        while (row<arr.length && col >=0){                          //At first iteration; row = 0 and col = 3
            if(arr[row][col] == target){
                return new int[] {row,col};
            }
            if(target < arr[row][col]){
                col--;
            } else {
                row++;

            }

        }
        return new int[] {-1,-1};


    }


}
