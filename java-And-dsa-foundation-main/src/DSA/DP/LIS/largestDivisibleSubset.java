package DSA.DP.LIS;
import java.util.*;

public class largestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int[] dp = new int[n];
        int[] parent = new int[n];
        Arrays.fill(dp,1);

        int maxLen =1 , lastIdx =0;

        for(int i =0 ; i< n; i++){
            parent[i] =i;
            for(int j=0 ; j< i ; j++){
                if(nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] +1;
                    parent[i] = j ;
                }
            }
            if(dp[i] > maxLen){
                maxLen = dp[i];
                lastIdx = i;
            }
        }
        ArrayList<Integer> subset = new ArrayList<>();
        while(parent[lastIdx] != lastIdx){
            subset.add(nums[lastIdx]);
            lastIdx = parent[lastIdx];
        }
        subset.add(nums[lastIdx]);

        Collections.reverse(subset);
        return subset;
    }
}
