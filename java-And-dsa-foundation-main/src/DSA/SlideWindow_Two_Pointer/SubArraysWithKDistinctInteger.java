package DSA.SlideWindow_Two_Pointer;

import java.util.HashMap;
import java.util.Map;

public class SubArraysWithKDistinctInteger {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return (helper(nums,k) - helper(nums , k-1));
    }

    public int helper(int[] nums , int k){
        int left =0 , right =0, count=0;

        Map<Integer , Integer> map = new HashMap<>();

        while(right < nums.length){
            map.put(nums[right] , map.getOrDefault(nums[right], 0)+1);

            while(map.size() > k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            count += right -left +1;
            right++;
        }
        return count;
    }
}
