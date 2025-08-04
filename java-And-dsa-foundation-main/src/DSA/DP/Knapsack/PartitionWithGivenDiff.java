package DSA.DP.Knapsack;

public class PartitionWithGivenDiff {
    int countPartitions(int[] arr, int d){
        // s1 - s2 = d
        // s1 + s2 = TotalSum
        // s1 = (d+ TotalSum)/2;
        int sum =0 ;
        for(int num : arr) sum+= num;
        int s1 = (d+sum)/2;
        if( (d+sum)%2 !=0 || sum < d ) return 0;
        return perfectSum(arr,s1);
    }

    public int perfectSum(int[] arr, int sum) {
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
