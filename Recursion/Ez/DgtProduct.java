package Recursion.Ez;

public class DgtProduct {
    public static void main(String[] args) {
        System.out.println(dgtpro(4509));
    }
    static int dgtpro(int n){
        /*if(n == 0){
            return 1;
        }*/
        if(n %10 == n){
            return n;
        }

        return dgtpro(n/10)*(n%10);
    }

}
