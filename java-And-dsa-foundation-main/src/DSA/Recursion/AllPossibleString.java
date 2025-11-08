package DSA.Recursion;

import java.util.*;

public class AllPossibleString {

    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> ans = new ArrayList<>();
        generate(ans ,0, s, new StringBuilder()  ) ;
        Collections.sort(ans);
        return ans;
    }

    private static void generate(List<String> ans , int i , String s , StringBuilder curr){

        if(i == s.length()){
            if(curr.length() > 0){
                ans.add(curr.toString());
            }
            return;
        }

        curr.append(s.charAt(i));
        generate(ans , i+1 , s, curr);
        curr.deleteCharAt(curr.length()-1);

        generate(ans , i+1 , s ,curr);
    }
}
