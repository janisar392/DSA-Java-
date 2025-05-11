package DSA.Array.Ques;

import java.util.*;

public class longestSubArray {
    public static int longestSubarrayWithMajorityGreaterThanK(int[] arr , int k){
        int n = arr.length;
        int[] temp = new int[n];

        for(int i =0 ; i< n ; i++){
            temp[i] = (arr[i] > k ) ? 1 :-1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0 ;
        int maxLen =0 ;

        for(int i =0 ; i< n ;i++){
            prefixSum += temp[i];

            if(prefixSum > 0){
                maxLen = i+1;
            }
            else{
                if(map.containsKey(prefixSum-1)){
                    int prevIndex = map.get(prefixSum-1);
                    maxLen = Math.max(maxLen , i-prevIndex);
                }
            }
            map.putIfAbsent(prefixSum , i);
        }
        return maxLen;
    }
}
