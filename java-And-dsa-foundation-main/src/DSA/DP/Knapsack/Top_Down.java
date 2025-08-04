package DSA.DP.Knapsack;

public class Top_Down {
    static int knapsack(int W, int val[], int wt[]){
        int n = wt.length;
        int[][] dp = new int[n+1][W+1];

        for(int i=0 ; i<=n ;i++){    // initialization
            for(int j=0 ; j<=W ; j++){
                if(i==0 || j==0){
                    dp[i][j] =0;
                }
            }
        }

        for(int i=1 ; i<=n ;i++){    // main block
            for(int j=1 ; j<=W ; j++){
                if(wt[i-1] <= j){     // i --> n and j -->w
                    dp[i][j] = Math.max((val[i-1] + dp[i-1][j-wt[i-1]] ),dp[i-1][j]);
                }
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][W];
    }
}
