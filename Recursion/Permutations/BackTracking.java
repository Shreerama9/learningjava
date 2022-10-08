package Recursion.Permutations;

import java.util.ArrayList;

public class BackTracking {
    public static void main(String[] args) {
        // System.out.println(StepMaze(3, 3));
        // Path("", 3, 3);
        // System.out.println(PathRet("", 3, 3));

        boolean[][] maze = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };

        PathObs("", maze, 1, 1);
    }

    // Movement can be down and right through the maze. Calculating possible
    // combinations
    static void Path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            Path(p + 'D', r - 1, c);
        }

        if (c > 1) {
            Path(p + 'R', r, c - 1);
        }

    }

    static int StepMaze(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int down = StepMaze(r - 1, c);
        int right = StepMaze(r, c - 1);
        // int diag = StepMaze(r - 1, c - 1);
        int total = down + right;
        // int total = down + right + diag; //Movement possiblity when diagonal movement
        // is permitted
        return total;
    }

    static ArrayList<String> PathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (r > 1) {
            list.addAll(PathRet(p + 'D', r - 1, c));
        }
        if (r > 1 && c > 1) {
            list.addAll(PathRet(p + "Z", r - 1, c - 1));
        }
        if (c > 1) {
            list.addAll(PathRet(p + 'R', r, c - 1));
        }
        return list;
    }

    static void PathObs(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            PathObs(p + 'D', maze, r + 1, c);
        }
        if (c < maze.length - 1) {
            PathObs(p + 'R', maze, r, c + 1);
        }
    }

}
