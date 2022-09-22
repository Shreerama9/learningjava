package Recursion;
//Recurrance Relation  , Recurcive Tree  ,   Breaking down into smaller pieces


public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(FiboSeries(6));



    }

    //fab(0) = 0 && fab(1) = 1
    // Recurence relation for fab  => Fab(N) = Fab(N-1) + Fab(N-2)

    static int FiboSeries(int n){
        if (n<2){
            return n;
        }
        return FiboSeries(n-1 ) + FiboSeries(n-2) ;
    }




}
