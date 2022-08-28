public class BubbleSort {


    public static void main(String[] args){
        int Array[];
        Array = new int[]{1,3,5,7,2};
        int i = 0;
        int ArrayLen = Array.length-2;
        int j = 0;
        System.out.println(Array[3]);
        while(i <= ArrayLen){
            while (j <= (ArrayLen-i)) {
                if (Array[j]>Array[j+1]){
                    int tmp = Array[j+1];
                    Array[j] = Array[j + 1];
                    Array[j+1] = tmp;

                 }j++;
            }i++;


        }
        System.out.println(Array[3]);

    }
}
