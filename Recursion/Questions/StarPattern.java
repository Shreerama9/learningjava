package Recursion.Questions;

public class StarPattern {
    public static void main(String[] args) {
        TrianglePattern(4, 0);

    }

    static void TrianglePattern(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            TrianglePattern(row, col + 1);
        } else {
            System.out.println();
            TrianglePattern(row - 1, 0);
        }

    }

}