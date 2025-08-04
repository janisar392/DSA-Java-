package DSA.DP.UnBoundedKnapsack;

public class unBoundedKnapsack {
    static int knapSack(int val[], int wt[], int sum) {
        int n = wt.length;

        int[][] dp = new int[n+1][sum+1];
        for(int i=0 ;i<= n ;i++) dp[i][0] =0;
        for(int j=0 ;j<= sum ;j++) dp[0][j] =0;

        for(int i=1 ; i<=n ;i++){
            for(int j=1 ; j<= sum ;j++){
                if(wt[i-1] <= j)
                    dp[i][j] = Math.max((val[i-1] + dp[i][j-wt[i-1]]) , dp[i-1][j]) ;
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}
