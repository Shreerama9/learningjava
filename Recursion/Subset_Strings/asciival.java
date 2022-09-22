package Recursion.Subset_Strings;

import java.util.ArrayList;

public class asciival {
    public static void main(String[] args) {
        String upstr = "abc";
        SubsqAscii("", upstr);
        System.out.println(SubSqAsciiList("", upstr));
    }

    static ArrayList<String> SubSqAsciiList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> List = new ArrayList<String>();
            List.add(p);
            return List;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = SubSqAsciiList(p + ch, up.substring(1));
        ArrayList<String> second = SubSqAsciiList(p, up.substring(1));
        ArrayList<String> third = SubSqAsciiList(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;

    }

    static void SubsqAscii(String Str, String upStr) {
        if (upStr.isEmpty()) {
            System.out.println(Str);
            return;
        }
        char ch = upStr.charAt(0);
        SubsqAscii(Str + ch, upStr.substring(1));
        SubsqAscii(Str + ch, upStr.substring(1));
        SubsqAscii(Str + (ch + 0), upStr.substring(1));

    }

}
