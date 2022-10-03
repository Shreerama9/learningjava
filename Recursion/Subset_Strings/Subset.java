package Recursion.Subset_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        List<List<Integer>> ans = subSet(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
        System.out.println("********************");
        // Duplicate integer
        int[] arrD = { 1, 2, 1 };
        List<List<Integer>> ansD = subSetDupli(arrD);
        for (List<Integer> listD : ansD) {
            System.out.println(listD);
        }

    }

    static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int size = outer.size();
            for (int index = 0; index < size; index++) {
                List<Integer> internal = new ArrayList<>(outer.get(index));
                internal.add(num);
                outer.add(internal);

            }
        }

        return outer;
    }

    static List<List<Integer>> subSetDupli(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for (int j = 0; j < arr.length; j++) {
            start = 0;
            if (j > 0 && arr[j] == arr[j - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);

            }
        }
        return outer;
    }

}
