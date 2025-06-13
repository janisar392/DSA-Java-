package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MaxDiffFreqOddAndEven2 {
    public int maxDifference(String s , int k){
        int n = s.length();
        int maxDiff = Integer.MIN_VALUE;

        for(int i =0 ; i< n ; i++){
            int[] freq = new int[128];

            for(int j =i ; j< n ; j++){
                freq[s.charAt(j)]++;

                if(j-i + 1 >= k){
                    List<Integer> oddFreq = new ArrayList<>();
                    List<Integer> evenFreq = new ArrayList<>();

                    for(int f : freq){
                        if(f > 0){
                            if(f%2 ==1){
                                oddFreq.add(f);
                            }else{
                                evenFreq.add(f);
                            }
                        }
                    }

                    for(int odd : oddFreq){
                        for(int even : evenFreq){
                            maxDiff = Math.max(maxDiff , odd -even);
                        }
                    }
                }
            }
        }
        return maxDiff == Integer.MIN_VALUE ? -1 : maxDiff;
    }
}
