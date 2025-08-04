package DSA.DP.Knapsack;

public class EqualSumPartition {
    static boolean equalPartition(int arr[]) {
        // code here
        int sum =0;
        for(int i=0 ; i<arr.length ; i++){
            sum += arr[i];
        }
        if(sum % 2 == 1) return false;
        else{
            int num = sum/2;
            return subsetSum( arr , num);
        }
    }

    private static boolean subsetSum(int[] arr , int sum){
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];
        for(int i=0 ; i<= n ;i++){
            for(int j=0 ; j<=sum ;j++){
                if(i==0) dp[i][j] = false;
                if(j==0) dp[i][j] = true;
            }
        }
        for(int i=1 ; i<= n ;i++){
            for(int j=1 ; j<=sum ;j++){
                if(arr[i-1] <= j)
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][sum];
    }
}
