package GeeksForGeeks;

import java.util.ArrayList;

public class PalindromeParts {

    public static ArrayList<ArrayList<String>> palindromeParts(String s) {
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        backtrack(0,s,new ArrayList<>() , ans);
        return ans;
    }
    public static void backtrack(int start , String s , ArrayList<String> currList , ArrayList<ArrayList<String>> ans){
        if(start == s.length()){
            ans.add(currList);
            return;
        }
        for(int end = start+1 ; end < s.length() ; end++){
            String subString = s.substring(start ,end);
            if(isPalindrome(subString)){
                currList.add(subString);
                backtrack(end , s, currList , ans);
                currList.remove(currList.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s){
        int low =0 , high = s.length()-1;
        while(low < high){
            if(s.charAt(low++) != s.charAt(high--)){
                return false;
            }
        }
        return true;
    }
}
