package DSA;

public class SearchCharinString {
    public static void main(String[] args){
        String str = "Shreerama";
        boolean value = searchCharInStr(str,'e' );
        System.out.println(value);


        //Second method
        boolean value2 = searchCharInString2(str,'a');
        System.out.println(value2);
    }


// Searching using charAt throughout the string for character : first method

    static boolean searchCharInStr(String str, char target ){
        if (str.length() == 0){
            return false;
        }
        for(int i = 0;i < str.length();i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

// Searching using charAt throughout the string for character : first method

    static boolean searchCharInString2(String str, char target ){
        if (str.length() == 0){
            return false;
        }
        for( char ch :  str.toCharArray() ){
            if (ch == target){
                return true;
            }
        }

        return false;
    }

}


