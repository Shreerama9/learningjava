package DSA.BinarySearch;

import java.util.Arrays;
//Acting wierd : WRONG
public class SortedMatrix {
    public static void main(String[] args) {
        int[][] mat2D = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int[] locof5 = search2DMat(mat2D,4);
        System.out.println(Arrays.toString(locof5));



    }


    static int[] binarySearch2DMat(int[][] matrix , int target, int row, int cstart, int cend){
        while(cstart< cend-1){
            int mid = cstart + (cend-cstart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] > target){
                cend = mid-1;
            }else {
                cstart = mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search2DMat(int[][] matrix, int target){
        int rows = matrix.length;
        int col = matrix[0].length-1; //Caution,Matrix may be empty.

        if(rows == 1){
            return binarySearch2DMat(matrix,target,1,0,col-1);
        }
        int rstart = 0;
        int rend = rows-1;
        int cmid = col/2;
        while(rstart< rend-1){
            int mid = rstart+(rend-rstart)/2;
            if (matrix[mid][cmid]==target) {
                return new int[]{mid,cmid};
            }
            if(matrix[mid][cmid]>target){
                rend = mid;
            }else {
                rstart = mid;
            }
            // Now we are left with 2 rows
            // Check the value is in col of 2 rows
            if(matrix[rstart][cmid]==target){
                return new int[]{rstart,cmid};
            }
            if(matrix[rstart][cmid]==target){
                return new int[]{rstart+1,cmid};
            }
            //SEARCHING IN HALFES
            if(matrix[rstart][cmid-1]>= target){
                return binarySearch2DMat(matrix,target,rstart,0,cmid-1);
            }

            if(matrix[rstart][cmid+1]>= target && matrix[rstart][col-1] <= target){
                return binarySearch2DMat(matrix,target,rstart,cmid+1,col-1);
            }

            if(matrix[rstart+1][cmid-1]<= target) {
                return binarySearch2DMat(matrix, target, rstart + 1, 0, cmid - 1);
            }else {
                return binarySearch2DMat(matrix,target,rstart+1,cmid+1,col-1);
            }


        }
        return new int[]{-1,-1};
    }
}



