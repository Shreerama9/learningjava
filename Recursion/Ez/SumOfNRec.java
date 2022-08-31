package Recursion.Ez;

public class SumOfNRec {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(9));
    }
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n+(sum(n-1));
    }
}

