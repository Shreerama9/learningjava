package DSA;
//Search for a value in an range of index

public class SearchInRange {
    public static void main (String[] args){
        int[] arr = {18,52,3,6,-7,8,-55,-563};
        int val = LinearSearch(arr, 8,1,6);
        System.out.println(val);
    }
    static int LinearSearch(int[] arr, int target,int start, int end){
        if (arr.length==0){
            return -1;
        }

        for (int i = start;i < end ; i++){
            int element = arr[i];
            if (target == element){
                return i;
            }
        }

        return -1;
    }

}
