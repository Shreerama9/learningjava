package DSA.BinarySearch;

public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,9,10,45};
        int val = binsear(arr,10);
        System.out.println(val);





    }
    //Returning Index
    static int binsear(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start / 2);
            if (target < arr[mid]) {
                end = mid - 1 ;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

}
