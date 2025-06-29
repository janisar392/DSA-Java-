package DSA.DP;

public class MaximumPathSum {

    public static int maximumPathSum(int[][] arr){
        int m = arr.length , n = arr[0].length;
        int[][] dp = new int[m][n];

        for(int i =0 ;i< n;i++){
            dp[0][i] = arr[0][i];
        }

        for(int i =1 ; i< m ; i++){
            for(int j =0 ; j< n ;i++){
                int left = (j > 0) ? arr[i-1][j-1] : 0;
                int top  = arr[i-1][j];
                int right= (j+1 < n ) ? arr[i-1][j+1]:0;

                dp[i][j] = arr[i][j] + Math.max(left , Math.max(top, right));
            }
        }
        int max =0;
        for(int i =0 ; i< n ;i++){
            max = Math.max(dp[m-1][i] , max);
        }
        return max;
    }
}
