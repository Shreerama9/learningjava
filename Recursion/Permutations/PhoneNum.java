package Recursion.Permutations;

import java.util.ArrayList;

public class PhoneNum {
    public static void main(String[] args) {

        PhoneNumAplha("", "28");

        ArrayList<String> Ans = new ArrayList<>();
        Ans = PhoneNumAplhalist("", "27");
        System.out.println(Ans);

    }

    static void PhoneNumAplha(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '1';
        if (digit == 6) {
            for (int i = (digit - 1) * 3; i < (digit * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                PhoneNumAplha(p + ch, up.substring(1));
            }
        } else if (digit == 7) {
            for (int i = ((digit - 1) * 3) + 1; i < (digit * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                PhoneNumAplha(p + ch, up.substring(1));
            }
        } else if (digit == 8) {
            for (int i = ((digit - 1) * 3) + 1; i < (digit * 3) + 2; i++) {
                char ch = (char) ('a' + i);
                PhoneNumAplha(p + ch, up.substring(1));
            }

        } else {
            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char) ('a' + i);
                PhoneNumAplha(p + ch, up.substring(1));
            }
        }

    }

    static ArrayList<String> PhoneNumAplhalist(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> List = new ArrayList<>();
        int digit = up.charAt(0) - '1';
        if (digit == 6) {
            for (int i = (digit - 1) * 3; i < (digit * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                List.addAll(PhoneNumAplhalist(p + ch, up.substring(1)));
            }
        } else if (digit == 7) {
            for (int i = ((digit - 1) * 3) + 1; i < (digit * 3) + 1; i++) {
                char ch = (char) ('a' + i);
                List.addAll(PhoneNumAplhalist(p + ch, up.substring(1)));
            }
        } else if (digit == 8) {
            for (int i = ((digit - 1) * 3) + 1; i < (digit * 3) + 2; i++) {
                char ch = (char) ('a' + i);
                List.addAll(PhoneNumAplhalist(p + ch, up.substring(1)));
            }

        } else {
            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char) ('a' + i);
                List.addAll(PhoneNumAplhalist(p + ch, up.substring(1)));
            }
        }

        return List;

    }

}
