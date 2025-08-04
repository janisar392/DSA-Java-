package DSA.DP.Knapsack;

public class minSumPartition {
    public int minDifference(int arr[]){
        int n = arr.length;
        int range =0;
        for (int num : arr)
            range += num;

        boolean[][] dp = new boolean[n+1][range+1];
        for(int i=0 ; i< n ;i++)
            dp[i][0] = true;

        for(int i=1 ; i<=n ;i++){
            for(int j=0 ; j<= range ; j++){
                if(arr[i-1] <= j)
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        int minDiff = Integer.MAX_VALUE;
        for(int s1 =0 ; s1 <= range ; s1++){
            if(dp[n][s1]){
                int s2 = range-s1;
                minDiff = Math.min(minDiff, Math.abs(s2-s1));
            }
        }
        return minDiff;
    }
}
