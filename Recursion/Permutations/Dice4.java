package Recursion.Permutations;

import java.util.ArrayList;

public class Dice4 {
    public static void main(String[] args) {

        System.out.println(DiceRoll("", 4));
    }

    static ArrayList<String> DiceRoll(String p, int target) {

        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> lst = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {

            lst.addAll(DiceRoll(p + i, target - i));
        }
        return lst;

    }

}
