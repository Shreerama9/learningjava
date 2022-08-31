package DSA;

public class SearchString {
    public static void main(String[] args){
        String[] Str = {"hi","rama","rattra"};
        String value1 =  searchstr(Str,"hi");
        System.out.println(value1);
        String value2 =  searchstr(Str,"hehehe");
        System.out.println(value2);
    }
    static String searchstr(String[] strarr, String target ){
        if (strarr.length == 0){
            return null;
        }
        for (int i = 0; i < strarr.length; i++){
            if (target==strarr[i]){
                return target;
            }
        }

        return null;
    }
}

