package GeeksForGeeks;

import java.util.*;

public class SubStrCount {
    public static int subStrCount(String s , int k){
        if(s.length() < k) return 0;
        Map<Character , Integer> map = new HashMap<>();
        int count=0;

        for(int i =0 ; i< s.length() ;i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) ,0)+1);

            if(i >= k){
                char outChar = s.charAt(i-k);
                map.put(outChar , map.get(outChar)-1);
                if(map.get(outChar) == 0){
                    map.remove(outChar);
                }
            }
            if(i > k-1){
                if(map.size() == k-1){
                    count++;
                }
            }
        }
        return count;
    }
}
