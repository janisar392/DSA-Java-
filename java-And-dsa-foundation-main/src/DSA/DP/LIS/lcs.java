package DSA.DP.LIS;

import java.util.Arrays;

public class lcs {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp , 1);
        int maxStick = 1;

        for(int i =1 ; i< n ; i++){
            for(int j=0 ; j < i ; j++){
                if(nums[j] < nums[i] && dp[j]+1 > dp[i] ){
                    dp[i] = dp[j]+1 ;
                }
            }
            maxStick = Math.max(maxStick , dp[i]);
        }
        return maxStick;
    }
}
