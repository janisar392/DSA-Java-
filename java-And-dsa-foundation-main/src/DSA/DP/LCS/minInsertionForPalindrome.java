package DSA.DP.LCS;

public class minInsertionForPalindrome {

    static int countMin(String s1) {
        String s2 = new StringBuilder(s1).reverse().toString();
        int n = s1.length();

        int[][] dp = new int [n+1][n+1];

        for(int i=0 ; i<= n ; i++){
            dp[i][0] =0;
            dp[0][i] =0;
        }

        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n ; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return n-dp[n][n];
    }
}
