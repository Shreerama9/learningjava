package Recursion.Questions;

public class linearSearchRec {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 8, 9, 66, 444 };
        System.out.println(searchRec(arr, 66, 0));
        System.out.println(searchRec(arr, 660, 0));
        // Revrese
        System.out.println(searchRecRev(arr, 66, arr.length - 1));
        System.out.println(searchRecRev(arr, 660, arr.length - 1));
    }

    static boolean searchRec(int[] arr, int target, int index) {
        if (arr.length == index) {
            return false;
        }
        if (arr[index] != target) {
            return searchRec(arr, target, index + 1);
        } else {
            return true;
        }

    }

    static boolean searchRecRev(int[] arr, int target, int index) {
        if (index == -1) {
            return false;
        }
        return arr[index] == target || searchRecRev(arr, target, index - 1);

    }

}
