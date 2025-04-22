package DSA.Array.LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class longestConsective {
    public static int longestConsecutiveNumber(int[] nums){
        HashSet<Integer> st = new HashSet<>();
        int n = nums.length;

        for(int num : nums){
            st.add(num);
        }
        int maxStreak=0;
        for(int num : st){
            if(!st.contains(num-1)){
                int currNum = num;
                int currStreak =1;

                while(st.contains(n+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;
    }
}
