package DSA.DP;

public class NumberOfPaths {
    public static int numberOfPaths(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;

        int[][] dp = new int[m][n];

        for(int i=0 ; i<m ;i++){
            for(int j=0 ; j<n ;j++){
                if(i==0 || j==0 ) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
