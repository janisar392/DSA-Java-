package DSA.SlideWindow_Two_Pointer;

import java.util.*;

public class longestSubarrayWithAtMostTwoDistinct {
    public static int totalElements(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        int st =0 ;
        int len =0 ;

        for(int i =0 ; i< arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

            while(map.size() > 2){
                map.put(arr[st] , map.get(arr[st])-1);
                if(map.get(arr[st])==0){
                    map.remove(arr[st]);
                }
                st++;
            }
            len = Math.max(len , i-st+1);
        }
        return len;
    }
}
