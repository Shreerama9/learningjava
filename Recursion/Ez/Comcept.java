package Recursion.Ez;

public class Comcept {
    public static void main(String[] args) {
        
        conc(7);
    }
    static void conc(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        conc(--n);         //will not work as n-- will first subtract the value and then pass
        //conc(n--)       //will not work as n-- will first pass the value and then subtract due to which it will cause stackoverflow problem


    }
}
