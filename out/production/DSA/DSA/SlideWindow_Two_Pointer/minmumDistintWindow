package DSA.SlideWindow_Two_Pointer;

import java.util.*;

public class minimumDistinctWindow {
    public static int minWindow(String str){
        int n = str.length();
       Set<Character> s = new HashSet<>();
       for(char ch : str.toCharArray()){
           s.add(ch);
       }
       Map<Character, Integer> map = new HashMap<>();
       int req = s.size();
       int ans = n;
       int left =0 , right=0 , curr=0;
       while (right < n){
           char c = str.charAt(right);

           map.put(c,map.getOrDefault(c,0)+1);
           if(map.get(c)==1) curr++;

           while(curr== req){
               ans = Math.min(ans , right-left+1);

               char l = str.charAt(left);
               map.put(l,map.get(l)-1);

               if(map.get(c)==0) curr--;
               left++;
           }
           right++;
       }
       return ans;
    }
}
