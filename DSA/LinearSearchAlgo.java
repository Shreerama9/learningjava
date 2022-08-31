package DSA;

public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,9,4,7};
        int value1 = LinearSearch(arr,5);
        System.out.println(value1);
        // Element not found test Case
        int value2 = LinearSearch(arr,15);
        System.out.println(value2);
        // Empty arr test Case
        int[] emptyarr = {};
        int value3 = LinearSearch(emptyarr,5);
        System.out.println(value3);

    }

    static int LinearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }

        for (int i = 0; i <arr.length;i++){
            int element = arr[i];
            if (target == element){
                return i;
            }
        }

        return -1;
    }

}