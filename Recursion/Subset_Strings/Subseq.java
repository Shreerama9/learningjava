package Recursion.Subset_Strings;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {

        String str = "Abd";
        subsequence("", str);
        System.out.println(SubSq("", str));
    }

    static void subsequence(String processed, String unprocessed) {

        while (unprocessed.length() == 0) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if (unprocessed.length() != 0) {
            subsequence(processed + ch, unprocessed.substring(1));
            subsequence(processed, unprocessed.substring(1));
        }

    }

    // ArrayList String
    static ArrayList<String> SubSq(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> List = new ArrayList<String>();
            List.add(p);
            return List;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = SubSq(p + ch, up.substring(1));
        ArrayList<String> right = SubSq(p, up.substring(1));
        left.addAll(right);
        return left;

    }
}
