package DSA.DP.MCM;
import java.util.*;

public class ScrambleString {
    static Map<String , Boolean> map;
    public boolean isScramble(String s1, String s2) {
        map = new HashMap<>();
        return solve(s1 ,s2);
    }

    private static boolean solve(String s1 , String s2){
        if(s1.equals(s2)) return true;

        int n = s1.length();
        if(n != s2.length()) return false;

        String key = s1 + " " + s2;

        if(map.containsKey(key)) return map.get(key);

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(!Arrays.equals(arr1,arr2)){
            map.put(key , false);
            return false;
        }

        for(int i= 1 ; i< n ; i++){
            // No swap
            if(solve(s1.substring(0,i) , s2.substring(0,i)) &&
                    solve(s1.substring(i) , s2.substring(i))){
                map.put(key , true);
                return true;
            }
            // Swap
            if(solve(s1.substring(0,i) ,s2.substring(n-i)) &&
                    solve(s1.substring(i) , s2.substring(0, n-i))){
                map.put(key , true);
                return true;
            }
        }
        map.put(key , false);
        return false;
    }

}
