package Recursion.Permutations;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permutation("", "1da");
        ArrayList<String> list = permList("", "avr");
        System.out.println(list);
        int ans = countPermutation("", "1da");
        System.out.println(ans);
    }

    static void permutation(String p, String up) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first + ch + second, up.substring(1));

        }

    }

    static ArrayList<String> permList(String p, String up) {
        if (up.length() == 0) {
            ArrayList<String> List = new ArrayList<>();
            List.add(p);
            return List;
        }

        char ch = up.charAt(0);

        ArrayList<String> pAll = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            pAll.addAll(permList(f + ch + s, up.substring(1)));

        }

        return pAll;

    }

    static int countPermutation(String p, String up) {
        if (up.length() == 0) {
            int j = 0;
            j++;
            return j;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = count + countPermutation(first + ch + second, up.substring(1));

        }
        return count;

    }

}