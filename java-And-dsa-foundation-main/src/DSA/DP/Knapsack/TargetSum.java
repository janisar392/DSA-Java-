package DSA.DP.Knapsack;

public class TargetSum {
    static int findTargetSumWays(int N, int[] arr, int target) {
        // code here
        int sum =0 ;
        for(int num : arr)  sum += num;

        if ((sum + target) % 2 != 0 || Math.abs(sum)< target) return 0;
        int s1 = (target+sum)/2;
        if (s1 < 0) return 0;

        return NoOfPerfectSubArray(arr,s1);
    }
    public static int  NoOfPerfectSubArray(int[] arr, int sum) {
        int n = arr.length;
        int[][] dp = new int[n + 1][sum + 1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = 1;
        for (int j = 1; j <= sum; j++)
            dp[0][j] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (arr[i - 1] <= j)
                    dp[i][j] = (dp[i - 1][j - arr[i - 1]] + dp[i - 1][j]);
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }

        return dp[n][sum];
    }
}
