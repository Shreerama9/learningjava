package Recursion.Questions;

public class PalindromeNum {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));

    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return helper(n / 10, digits - 1) + rem * (int) Math.pow(10, digits - 1);
    }

    static boolean isPalindrome(int n) {
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits) == n;
    }

}