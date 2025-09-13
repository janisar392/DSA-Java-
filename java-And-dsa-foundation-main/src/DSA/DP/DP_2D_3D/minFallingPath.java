package DSA.DP.DP_2D_3D;

public class minFallingPath {

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];

        for(int i =0 ; i< n ; i++){
            dp[0][i] = matrix[0][i];
        }

        for(int i =1 ; i< n ; i++){
            for(int j=0 ; j < n ; j++){
                int left =(j > 0) ? dp[i-1][j-1] : Integer.MAX_VALUE;
                int up = dp[i-1][j];
                int right= (j+1 < n) ? dp[i-1][j+1] : Integer.MAX_VALUE;

                dp[i][j] = matrix[i][j] + Math.min(left, Math.min(up, right));
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i =0 ; i< n ; i++){
            ans = Math.min( dp[n-1][i] , ans);
        }

        return ans;
    }
}
