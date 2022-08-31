package Recursion.Ez;

public class FactorialREc {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Factorial(n));
    }

    static int Factorial(int n){
        if(n == 1){
            return 1;
        }
        int fac = n*(Factorial(n-1));
    return fac;
    }
}
