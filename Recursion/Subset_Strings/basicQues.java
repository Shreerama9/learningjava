package Recursion.Subset_Strings;

public class basicQues {
    public static void main(String[] args) {
        String str1 = "baccaf";
        remova("", str1);

        String str2 = "Violetevergarden";
        System.out.println(removeEver(str2));
        ;

    }

    // Removing char
    static void remova(String answer, String unprocessed) {
        if (unprocessed.length() == 0) {
            System.out.println(answer);
            return;
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'a') {
            remova(answer, unprocessed.substring(1));
        } else {
            remova(answer + ch, unprocessed.substring(1));
        }
    }

    static String removeEver(String str) {
        if (str.length() == 0) {
            return "";
        }

        if (str.startsWith("ever")) {
            return removeEver(str.substring(4));
        } else {
            return str.charAt(0) + removeEver(str.substring(1));
        }

    }

}