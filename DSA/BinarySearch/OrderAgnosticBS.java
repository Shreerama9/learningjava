package DSA.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
    /*    int[] arrA = {1,2,3,5,6,9,10,45};
        int valA = orderagnosticbs(arrA,10);
        System.out.println(valA);
        int[] arrD = {45,10,8,6,2,1,1,1,1,1,1};
        int valD = orderagnosticbs(arrD,10);
        System.out.println(valD);
    */
        int[] arrA = {1,2,3,5,6,9,10,45};
        int valA = ordAgnosticBS(arrA, 2);
        System.out.println(valA);
        int[] arrD = {45,10,8,6,2,1,1,1,1,1,1};
        int valD = ordAgnosticBS(arrD,10);
        System.out.println(valD);

    }


    static int ordAgnosticBS(int[] arr,int target){

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start]<arr[end];


        while (start <= end) {
            int mid = start + (end - start / 2);
            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]) {
                    end = mid - 1 ;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }

            }



        }
        return -1;
    }
}




/*
    static int orderagnosticbs(int[] arr, int target){
        if (arr[arr.length-1] > arr[0]){
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
        }else {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start / 2);
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }

            }
            return -1;
        }
    }

 */
