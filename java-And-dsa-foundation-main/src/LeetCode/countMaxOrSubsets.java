package LeetCode;

public class countMaxOrSubsets {
    int count =0;
    int maxOr =0;

    public int CountMaxOrSubsets(int[] nums){
       for(int num : nums){
           maxOr |= num;
       }
       dfs(nums, 0,0);
       return count;
    }
    void dfs(int[] nums , int idx , int currOr){
        if(idx == nums[nums.length]){
            if(currOr == maxOr){
                count++;
            }
            return;
        }
        dfs(nums, idx+1, currOr|nums[idx]);
        dfs(nums, idx+1, currOr);
    }
}
