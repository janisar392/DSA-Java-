package DSA.DP.Knapsack;

import java.util.Arrays;

public class Memoization {
    private int[][] dp;

    public int knapsack(int[] wt, int[] val, int w, int n) {
        dp = new int[n + 1][w + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(wt, val, w, n);
    }

    private int solve(int[] wt, int[] val, int w, int n) {
        if (n == 0 || w == 0) return 0;

        if (dp[n][w] != -1) return dp[n][w];

        if (wt[n - 1] <= w) {
            dp[n][w] = Math.max(
                    val[n - 1] + solve(wt, val, w - wt[n - 1], n - 1),
                    solve(wt, val, w, n - 1)
            );
        } else {
            dp[n][w] = solve(wt, val, w, n - 1);
        }
        return dp[n][w];
    }
}
