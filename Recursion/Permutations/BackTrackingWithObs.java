package Recursion.Permutations;

public class BackTrackingWithObs {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, false, true },
                { true, true, true },
        };
        PathObstacle("", board, 0, 0);
        System.out.println();
    }

    static void PathObstacle(String p, boolean[][] maze, int obsx, int obsy) {
        if (obsx == maze.length - 1 && obsy == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[obsx][obsy]) {
            return;
        }
        if (obsx < maze.length - 1) {
            PathObstacle(p + 'D', maze, obsx + 1, obsy);
        }
        if (obsy < maze[0].length - 1) {
            PathObstacle(p + 'R', maze, obsx, obsy + 1);
        }
    }

}