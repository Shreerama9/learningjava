package DSA;
/*/home/shreerama/.jdks/openjdk-18.0.2/bin/java -javaagent:/snap/intellij-idea-community/384/lib/idea_rt.jar=41135:/snap/intellij-idea-community/384/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/shreerama/Desktop/LearningJAVA/out/production/LearningJAVA DSA.maxWealth
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 3
	at DSA.maxWealth.maxwlth(maxWealth.java:21)
	at DSA.maxWealth.main(maxWealth.java:10)                ERROR
*/
public class maxWealth {
    public static void main(String[] args) {

        int[][] arr = new int[][]{{18, 52, 3},
                {6, -7, 8},
                {-55, -563}};
        int val = maxwlth(arr);
        System.out.println(val);


    }
    static int maxwlth(int[][] arr){
        int maxW = Integer.MIN_VALUE;
        int wlth = 0;

        for (int[] rows : arr) {
            for (int j : rows) {
                wlth = wlth + rows[j];
            }
            if (wlth > maxW) {
                maxW = wlth;
            }
        }
        return maxW;
    }
}
