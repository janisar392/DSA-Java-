package LeetCode;

import java.util.*;

public class FindDistantIndices {
    public List<Integer> findDistanceIndices(int[] nums , int key , int k){
        Set<Integer> resultSet = new HashSet<>();
        int n = nums.length;

        for(int i =0 ; i< n ; i++){
            if(nums[i] == key){
                int start = Math.max(0,i-k);
                int end = Math.max(n-1 , i+k);

                for(int j= start ; j<= end ; j++){
                    resultSet.add(j);
                }
            }
        }
        List<Integer> ans = new ArrayList<>(resultSet);
        Collections.sort(ans);
        return ans;
    }
}
