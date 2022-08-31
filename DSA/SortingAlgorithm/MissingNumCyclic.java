package DSA.SortingAlgorithm;

public class MissingNumCyclic {
    public static void main(String[] args) {

        int[] arr = {1, 3, 0};
        int sol = missingNumber(arr);
        System.out.println(sol);


    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (arr[i] < i) {
            int correct = arr[i];
            if (arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length + 1; j++) {
            if (arr[j] != j) {
                return arr[j];

            }
        }
        return i;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
