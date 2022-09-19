package Recursion.Subset_Strings;

public class Subseq {
    public static void main(String[] args) {

        String str = "Abd";
        subsequence("", str);

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

}
