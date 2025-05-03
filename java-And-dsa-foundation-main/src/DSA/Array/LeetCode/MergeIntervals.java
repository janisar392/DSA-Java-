package DSA.Array.LeetCode;

import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
       if(intervals.length <= 1) return intervals;
       Arrays.sort(intervals , (a,b) -> Integer.compare(a[0],b[0]));
       List<int[]> ans = new ArrayList<>();

       for(int[] interval : intervals){
           if(interval[0] > ans.get(ans.size()-1)[1]){
               ans.add(interval);
           } else {
               ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1] , interval[1]);
           }
       }
       return ans.toArray(new int[ans.size()][]);
    }
}
