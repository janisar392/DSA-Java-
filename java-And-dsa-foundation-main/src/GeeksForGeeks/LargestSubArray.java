package GeeksForGeeks;

import java.util.HashMap;

public class LargestSubArray {

    public static int largestSubArray(int[] arr ){
        HashMap<Integer,Integer> mp = new HashMap<>();

        int mxLen = 0, prefSum =0;
        mp.put(0,-1);

        for(int i=0 ; i<arr.length;i++){
            prefSum += arr[i];

            if(mp.containsKey(prefSum)){
                mxLen = Math.max(mxLen ,i- mp.get(prefSum));
            }
            else{
                mp.put(prefSum,i);
            }
        }
        return mxLen;
    }
}
