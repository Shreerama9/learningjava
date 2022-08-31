package Recursion;

public class BinarySeachRec {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,12,15,19,200,1000};
        System.out.println(BS(arr,19,0,(arr.length-1)));


    }

    static int BS(int[] arr, int targetVal, int start, int end){
        int mid = start + ((end -start)/2);
        if (start>end) {
            return -1;
        }

        if(arr[mid] == targetVal ){
            return mid;
        }
        if (targetVal > arr[mid]){
            return BS(arr,targetVal,mid+1,end);
        }else if(targetVal < arr[mid]){
            return BS(arr,targetVal,start,mid-1);
        }
        return mid;
    }

}


