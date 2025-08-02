package GeeksForGeeks;

import java.util.HashMap;

public class SubArraysWithSumK {
    public int cntSubarrays(int[] arr, int k){

        int count =0;
        int prefixSum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0; i< arr.length ;i++){
            prefixSum += arr[i];

            if(map.containsKey(prefixSum-k)){
                count += map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
