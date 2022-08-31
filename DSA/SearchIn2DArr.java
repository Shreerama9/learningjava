package DSA;

import java.util.Arrays;

public class SearchIn2DArr {public static void main (String[] args) {
    int[][] Arr = new int[][]{{18, 52, 3},
            { 6, -7, 8},
            {-55, 563}};
    int[] val = Searchin2Darr(Arr, 6);
    System.out.println(Arrays.toString(val));
    int maxValin2DArr = maxVal(Arr);
    System.out.println(maxValin2DArr);
    System.out.println(Integer.MIN_VALUE);//Coz Range of datatype
    }

    static int[] Searchin2Darr(int[][] arr, int target){
        if(arr.length ==0){
            return new int[]{-1,-1};
        }
        for (int i =0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++ ){
                if(arr[i][j] == target ){
                    return new int[] {i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }
    static int maxVal(int[][] arr){
        if(arr.length ==0){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        for (int i =0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

}
