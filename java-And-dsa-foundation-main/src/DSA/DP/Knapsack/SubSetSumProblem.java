package DSA.DP.Knapsack;

public class SubSetSumProblem {
    public static boolean subsetSum(int[] arr , int sum){
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];
        for(int i=0; i<= n ;i++){
            for(int j=0 ; j<= sum ; j++){
                if(i==0) dp[i][j] = false;
                if(j==0) dp[i][j] = true;
            }
        }
        for(int i=1; i<= n ;i++){
            for(int j=1 ; j<= sum ; j++){
                if(arr[i-1] <= j)
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}
