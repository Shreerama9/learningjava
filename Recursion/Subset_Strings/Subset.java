package Recursion.Subset_Strings;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        List<List<Integer>> ans = subSet(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
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

}
