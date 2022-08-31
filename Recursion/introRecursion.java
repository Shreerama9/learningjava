package Recursion;

public class introRecursion {
    public static void main(String[] args) {
        String val ="";

        printLines(0);
    }


    static void printLines(int n){

        if (n >=5){
            System.out.println(5);
            return ;
        }

        System.out.println(n);

        printLines(n+1);


    }


}
