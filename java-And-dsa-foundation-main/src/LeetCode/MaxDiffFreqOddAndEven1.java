package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MaxDiffFreqOddAndEven1 {

    public int maxDiff(String s){
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch -'a']++;
        }

        List<Integer> oddFreq = new ArrayList<>();
        List<Integer> evenFreq = new ArrayList<>();

        for(int f : freq){
            if(f > 0){
                if(f % 2 == 1){
                    oddFreq.add(f);
                }else{
                    evenFreq.add(f);
                }
            }
        }
        int maxDiff = Integer.MIN_VALUE;
        for(int odd : oddFreq){
            for(int even : evenFreq){
                maxDiff = Math.max(maxDiff , odd- even);
            }
        }
        return maxDiff == Integer.MIN_VALUE ? 0 : maxDiff;
    }
}
