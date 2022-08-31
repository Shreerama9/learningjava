package Recursion.Ez;

public class nto1 {
    public static void main(String[] args) {
//        ReverseCounting(7);
        RevNormFunc(7);

    }
    static void ReverseCounting(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        ReverseCounting(n-1);

    }


    static void RevNormFunc(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        RevNormFunc(n-1);
        System.out.println(n);

    }
}
