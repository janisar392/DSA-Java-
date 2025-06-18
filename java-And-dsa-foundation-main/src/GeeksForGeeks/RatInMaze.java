package GeeksForGeeks;
import java.util.*;

public class RatInMaze {
    private void findPaths(int sr, int sc, int er, int ec, String s, ArrayList<ArrayList<Integer>> mat, ArrayList<String> paths) {
        if (sr < 0 || sc < 0 || sr > er || sc > ec || mat.get(sr).get(sc) == 0 || mat.get(sr).get(sc) == -1) return;

        if (sr == er && sc == ec) {
            paths.add(s);
            return;
        }

        // Mark as visited
        mat.get(sr).set(sc, -1);

        // Move in all four directions
        findPaths(sr + 1, sc, er, ec, s + "D", mat, paths); // Down
        findPaths(sr, sc - 1, er, ec, s + "L", mat, paths); // Left
        findPaths(sr, sc + 1, er, ec, s + "R", mat, paths); // Right
        findPaths(sr - 1, sc, er, ec, s + "U", mat, paths); // Up

        // Unmark for backtracking
        mat.get(sr).set(sc, 1);
    }

    // Function to find all possible paths
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        // code here
        ArrayList<String> paths = new ArrayList<>();
        int n =mat.size();

        if (n == 0 || mat.get(0).get(0) == 0 || mat.get(n - 1).get(n - 1) == 0) {
            return paths;
        }

        findPaths(0, 0, n - 1, n - 1, "", mat, paths);
        return paths;
    }
}
