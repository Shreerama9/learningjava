package Recursion.Ez;

public class RevNum {
    static int sum = 0; // VeryImp as it is outside val

    public static void main(String[] args) {
        revNumDgt(567);
        System.out.println(sum);
    }

    static void revNumDgt(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;

        sum = sum * 10 + rem;
        revNumDgt(n / 10);
    }
}
