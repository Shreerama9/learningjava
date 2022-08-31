package DSA;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {23, 32826, 54654, 354, 3366, 4};
        int val = numevndgt(arr);
        System.out.println(val);
        System.out.println(dgt2(-4561321));

    }





    //1 METHOD
    static int numevndgt(int[] arr){
        int count = 0;
        for( int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numofevendgt = numdgt(num);
        return numofevendgt%2==0;
    }

    static int numdgt(int num) {
        int cnt = 0;
        while (num>0){
            cnt++;
            num = num/10;
        }
        return cnt;
    }

    //2 METHOD
    static int dgt2(int num){
        if (num < 0){
            num = num*1;
        }

        return (int)(Math.log10(num))+1;
    }


}


