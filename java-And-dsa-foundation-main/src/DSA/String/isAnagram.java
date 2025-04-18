package DSA.String;

import java.util.HashMap;

public class isAnagram {
    public static HashMap<Character,Integer> makeFrek(String str){
        HashMap<Character ,Integer> mp = new HashMap<>();
        for(int i=0 ; i< str.length();i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                int currFreq =mp.get(ch);
                mp.put(ch,currFreq+1);
            }
        }
        return mp;
    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mp1 = makeFrek(s);
        HashMap<Character,Integer> mp2 = makeFrek(t);

        return mp1.equals(mp2);
    }
}
