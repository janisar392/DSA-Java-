package DSA.DP;

public class MaximumPathSum {

    public int maximumPath(int[][] mat) {
        int m =mat.length , n =mat[0].length;

        int[][] dp = new int[m][n];

        for(int j =0 ;j < n ;j++){
            dp[0][j] = mat[0][j];
        }

        for(int i =1 ; i< m ; i++){
            for(int j =0 ; j<n ;j++){
                int left = (j>0) ? dp[i-1][j-1] :0 ;
                int up = dp[i-1][j];
                int right = (j+1 < n ) ? dp[i-1][j+1] :0;

                dp[i][j] = mat[i][j] + Math.max(left ,Math.max(right , up));
            }
        }
        int max =-1;
        for(int i =0 ; i< n ; i++){
            max = Math.max(max ,dp[m-1][i]);
        }
        return max;
    }
}
