package DSA.Recursion;

import java.util.Arrays;

public class subsequenceCountWays {

    private static int[][] dp;
    private static int mod = 1_0000_0000_7;
    public static int countWays(String s1, String s2) {

        dp = new int[s1.length()][s2.length()];
        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }
        return solve(s1 , s2 , 0, 0);

    }

    private static int solve(String s1 , String s2 , int i , int j){

        if(j == s2.length()) return 1;
        if(i == s1.length()) return 0;

        if(dp[i][j] != -1) return dp[i][j] ;

        long ans =0;

        if(s1.charAt(i) == s2.charAt(j)){
            ans = (solve(s1, s2, i+1 , j+1)  + solve(s1, s2 , i+1, j)) % mod ;
        }else{
            ans = solve(s1, s2 , i+1 , j) % mod ;
        }

        return dp[i][j] = (int)ans;
    }
}
