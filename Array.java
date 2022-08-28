import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        //for primitive types
        int [] rnos;            //declaration of an array
        rnos = new int[7];      // DMA
        Scanner in = new Scanner(System.in);
        System.out.println(rnos[1]);

        for(int i = 1;i < rnos.length;i++ ){
            rnos[i] = in.nextInt();
        }
/*
        for (int i = 0;i < rnos.length;i++ ){
            System.out.println(rnos[i]+ " ");
        }
*/
/*        for (int num : rnos ){
            System.out.println(num + " ");
        }
*/
        System.out.println(Arrays.toString(rnos));  //Easiest way           Arrays use for loop in bg


        //For reference types:

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++ ){
            str[i] = in.next();
        }
        str[2] = "Shreerama";
        System.out.println(Arrays.toString(str));



    }
}
