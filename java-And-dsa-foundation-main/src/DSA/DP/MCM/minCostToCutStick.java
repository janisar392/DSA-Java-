package DSA.DP.MCM;
import java.util.Arrays;

public class minCostToCutStick {

    static int[][] dp;

    public int minCost(int n, int[] cuts) {
        int m = cuts.length;
        int[] newCuts = new int[m + 2];

        newCuts[0] = 0;
        newCuts[m + 1] = n;
        for (int i = 0; i < m; i++) {
            newCuts[i + 1] = cuts[i];
        }

        Arrays.sort(newCuts);

        dp = new int[m + 2][m + 2];
        for (int[] row : dp) Arrays.fill(row, -1);

        return solve(newCuts, 0, m + 1);
    }

    private static int solve(int[] cuts, int i, int j) {
        if (i + 1 == j) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int min = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {
            int cost = (cuts[j] - cuts[i])
                    + solve(cuts, i, k)
                    + solve(cuts, k, j);
            min = Math.min(min, cost);
        }

        return dp[i][j] = min;
    }
}
