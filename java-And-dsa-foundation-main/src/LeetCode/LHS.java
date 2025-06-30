package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LHS {

    public int findLHS(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        int ans =0 ;

        for(int num : nums){
            map.put(num , map.getOrDefault(num , 1)+1);
        }

        for(int key : map.keySet()){
            if(map.containsKey(key+1)){
                int len = map.get(key) + map.get(key+1);
                ans = Math.max(ans, len);
            }
        }
        return ans;
    }
}
