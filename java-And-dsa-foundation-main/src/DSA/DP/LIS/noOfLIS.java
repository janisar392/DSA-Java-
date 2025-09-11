package DSA.DP.LIS;

public class noOfLIS {
    public int findNumberOfLIS(int[] nums) {

        int n = nums.length;
        int[] dp = new int[n];
        int[] count = new int[n];

        for(int i=0 ; i< n ; i++){
            dp[i] =1;
            count[i] =1;
        }
        int max =1;

        for(int i =1 ; i< n ; i++){
            for(int j =0 ; j< i ; j++){
                if(nums[j] < nums[i] && dp[j]+ 1 > dp[i]){
                    dp[i] = dp[j]+1;
                    count[i] = count[j];
                }else if(nums[j] < nums[i] && dp[j]+1 == dp[i]){
                    count[i] += count[j];
                }
            }
            max = Math.max(max , dp[i]);
        }

        int ans =0;
        for(int i =0 ; i< n ; i++){
            if(dp[i] == max){
                ans += count[i];
            }
        }
        return ans;
    }
}
