package DSA;

import java.util.Arrays;

//Find min element in the array
public class FindMin {
    public static void main (String[] args) {
        int[] arr = {18, 52, 3, 6, -7, 8, -55, -563};
        System.out.println(Arrays.toString(arr));
        int MINVAL = minInt(arr);
        System.out.println(MINVAL);
    }

    static int minInt(int[] arr){
        int minVal = arr[0];
        for (int i = 0; i< arr.length;  ){
            if(minVal>=arr[i]){
                minVal = arr[i];
            }
            i++;
        }
        return minVal;
    }
}
