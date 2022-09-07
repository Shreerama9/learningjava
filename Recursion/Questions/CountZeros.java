package Recursion.Questions;

public class CountZeros {
    public static void main(String[] args) {
        // int count = 0;
        // System.out.println(countZeros(1000540, count));

        System.out.println(countZero(150650000));

    }

    // static int countZeros(int n, int count) {
    // if (n == 0) {
    // return count;
    // }
    // int rem = n % 10;
    // if (rem == 0) {
    // count++;
    // return countZeros(n / 10, count);
    // } else {
    // return countZeros(n / 10, count);
    // }}

    static int countZero(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        if (n % 10 == 0) {
            return helper(n / 10, c + 1);
        } else {
            return helper(n / 10, c);
        }

    }

}
