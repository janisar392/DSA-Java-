package DSA.DP.MCM;

public class Memoization {
    static int[][] dp;
    static int MCM(int [] arr){
        int n = arr.length;
        dp = new int[n][n];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j< n ; j++){
                dp[i][j] =-1;
            }
        }
        return solve(arr,1,n-1);
    }
    static int solve(int[] arr , int i , int j){
        if(i >= j) return 0;

        if(dp[i][j] != -1) return dp[i][j];
        int min = Integer.MAX_VALUE;

        for(int k =i ; k< j ;k++){
            int left = solve(arr,i,k);
            int right = solve(arr, k+1, j);
            int cost = arr[i-1] * arr[k] * arr[j];

            int temp = left + right + cost;
            min = Math.min(min , temp);
        }
        return dp[i][j] = min;
    }
}
