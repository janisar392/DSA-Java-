package DSA.SlideWindow_Two_Pointer;

import java.util.*;

public class MaxSubStringNoRepeat {
    public static int maxSubStringWithoutRepeat(String str){
        if(str.length() == 0) return 0;

        int maxAns = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        int left =0;

        for(int right = 0 ; right < str.length() ; right++){
            if(set.contains(str.charAt(right))){
                while(left < right && set.contains(str.charAt(right))){
                    set.remove(str.charAt(left));
                    left++;
                }
            }
            set.add(str.charAt(right));
            maxAns = Math.max(maxAns, right-left+1);
        }
        return maxAns;
    }
}
