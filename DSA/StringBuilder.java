package DSA;

public class StringBuilder {
    public static void main(String[] args) {
        //String Pool (when changes string value it creates new object) and Immutability (for security purpose)
        // If a and b has same string value then they both refer to same ref variable in heap memory
        // Comparing Strings : ==
        String a = "Shreerama";
        System.out.println(a);
        a = "Venkata";
        System.out.println(a);
        String b = "Venkata";
        System.out.println(a == b);
        //How to create diff objects of same values         *new*
        String c = new String("Venkata");       // Despite having same value they both have diff ref var so they cant be same Heap mom
        System.out.println(a == c);
        System.out.println();
        // How to only chech with value that are they really same : USE  : method  == varname1.equals(varname2)
        System.out.println(a.equals(c));






        //CharAt : Way to index a String
        System.out.println(a.charAt(0));
        //FUction Overloading
    }

}
