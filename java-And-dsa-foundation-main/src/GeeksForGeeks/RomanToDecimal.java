package GeeksForGeeks;

import java.util.*;

public class RomanToDecimal {
    public int romanToDecimal(String s){

        Map<Character , Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V' ,5);
        map.put('X' ,10);
        map.put('L' ,50);
        map.put('C' ,100);
        map.put('D',500);
        map.put('M',1000);

        int ans = 0;
        int n = s.length();
        for(int i=0 ; i < n ; i++){
            int value = map.get(s.charAt(i));
            if(i+1 < n && value < map.get(s.charAt(i+1))){
                ans -= value;
            }else
                ans += value;
        }
        return ans;
    }
}
