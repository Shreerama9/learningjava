package DSA;

public class Search2DarrBool {
    public static void main (String[] args) {
        int[][] arr = new int[][]{{18, 52, 3},
                { 6, -7, 8},
                {-55, -563}};
        boolean val = Searchin2Darr(arr,7);
        System.out.println(val);
    }

        static boolean Searchin2Darr(int[][] arr, int target){
            if(arr.length ==0){
                return false;
            }
            for (int i =0;i<arr.length;i++){
                for (int j = 0; j < arr[i].length; j++ ){
                    if(arr[i][j] == target ){
                        return true;
                    }
                }

            }
            return false;
        }

    }

