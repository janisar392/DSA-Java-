package DSA.DP.StockBuySell;

public class BuySell2Transaction {
    public static int maxProfit(int[] prices) {
        // code here
        int n = prices.length;
        int T = 2;
        int[][] dp = new int[T+1][n];

        for(int k =1 ; k<=T ; k++){
            int maxDiff = -prices[0];
            for(int i=1 ; i< n ; i++){
                dp[k][i] = Math.max(dp[k][i-1] , prices[i]+ maxDiff);
                maxDiff  = Math.max(maxDiff , dp[k-1][i] - prices[i]);
            }
        }
        return dp[T][n-1];
    }
}
