package DSA.SlideWindow_Two_Pointer;

import java.util.HashMap;

public class LongestSubArrayWithSumK {

    public static int longestSubArray(int[] arr , int k){
        int maxLen =0;
        int sum =0;

        HashMap<Integer,Integer> sumMap = new HashMap<>();
        for(int i=0 ; i< arr.length;i++){
            sum += arr[i];

            if(sum == k){
                maxLen =i+1;
            }
            if(sumMap.containsKey(sum -k)){
                maxLen = Math.max(maxLen , i - sumMap.get(sum-k));
            }
            if(!sumMap.containsKey(sum)){
                sumMap.put(sum , i);
            }
        }
        return maxLen;
    }
}
