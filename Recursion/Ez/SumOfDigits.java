package Recursion.Ez;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(DgtSum(4689));
    }
    static int DgtSum(int n){
        if(n == 0){
            return 0;
        }
        int rem = n%10;
        return DgtSum(n/10)+ rem;

    }


}
