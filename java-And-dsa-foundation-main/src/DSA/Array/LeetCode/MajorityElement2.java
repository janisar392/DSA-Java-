package DSA.Array.LeetCode;

import java.util.*;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] arr){
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        Map<Integer , Integer> map = new HashMap<>();
        int min = (int)n/3 +1;

        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num)==min){
                ans.add(num);
            }
            if(ans.size()==2) break;
        }
        Collections.sort(ans);
        return ans;
    }
}
