import java.util.Arrays;

public class revArr {
    public static void main(String[] args){
        int[] arrRev = {1,3,5,9,7};

        System.out.println(Arrays.toString(arrRev));
        System.out.println();
        reversarr(arrRev);
        System.out.println(Arrays.toString(arrRev));


    }


    static void reversarr(int[] arr) {
        int i = 0;
        int j = arr.length-1;

        while (i < j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
//WHen used nested for loop it was fixated on one loop which when runed again and again making something not logical/answers.