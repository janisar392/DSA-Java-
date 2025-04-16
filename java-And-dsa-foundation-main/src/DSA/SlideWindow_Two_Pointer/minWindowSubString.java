package DSA.SlideWindow_Two_Pointer;

import java.util.HashMap;
import java.util.Map;

public class minWindowSubString {
    public String minWindow(String s, String t) {
        if(s==null || s.length()==0 || t.length() ==0) return "";

        Map<Character , Integer> tMap = new HashMap<>();
        for(char c : t.toCharArray()){
            tMap.put(c,tMap.getOrDefault(c,0)+1);
        }

        int left =0 , right =0 ,minLen = Integer.MAX_VALUE , minIndex =0, matchCount =0;

        Map<Character , Integer> wMap = new HashMap<>();
        while(right < s.length()){
            char c =s.charAt(right);
            wMap.put(c, wMap.getOrDefault(c,0)+1);

            if(tMap.containsKey(c) && wMap.get(c) <= tMap.get(c))
                matchCount++;

            while (matchCount == t.length()){
                if (right-left+1 < minLen){
                    minLen = right-left+1;
                    minIndex = left;
                }
                char leftChar = s.charAt(left);
                wMap.put(leftChar , wMap.get(leftChar)-1);
                if(tMap.containsKey(leftChar) && wMap.get(leftChar) < tMap.get(leftChar)){
                    matchCount--;
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minIndex, minIndex+minLen);
    }
}
