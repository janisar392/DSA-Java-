package DSA.DP.LCS;

import java.util.Arrays;

public class Memoization {
    private static int[][] dp;

    public static int LCS(String x, String y, int n, int m) {

        dp = new int[n + 1][m + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(x, y, n, m);
    }

    private static int solve(String x, String y, int n, int m) {
        if (n == 0 || m == 0) return 0;

        if (dp[n][m] != -1) return dp[n][m];

        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            dp[n][m] = 1 + solve(x, y, n - 1, m - 1);
        } else {
            dp[n][m] = Math.max(solve(x, y, n, m - 1), solve(x, y, n - 1, m));
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String x = "abcde";
        String y = "ace";
        int result = LCS(x, y, x.length(), y.length());
        System.out.println("LCS length: " + result);
    }
}
