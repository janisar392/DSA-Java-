package LeetCode;

import java.util.*;

public class Solution_46 {

    public static void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
    }

    public static void helper(int[] nums , int idx ,List<List<Integer>> ans){

        int n = nums.length;
        if(idx==n-1){
            List<Integer> l = new ArrayList<>();
            for(int i=0; i<n ; i++){
                l.add(nums[i]);
            }
            ans.add(l);
            return;
        }
        for(int i =idx ; i<n; i++){
            swap(i,idx,nums);
            helper(nums, idx+1, ans);
            swap(i,idx,nums);
        }

    }

    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0,ans);

        return ans;
    }
}
