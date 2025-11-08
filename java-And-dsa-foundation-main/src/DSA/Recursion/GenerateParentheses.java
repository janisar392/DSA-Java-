package DSA.Recursion;

import java.util.*;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans , "" , 0,0,n);
        return ans;
    }

    private static void generate(List<String> ans , String curr , int open , int close , int n){

        if(n*2 == curr.length()){
            ans.add(curr);
            return;
        }

        if(open < n ){
            generate( ans , curr+"(" , open+1 , close , n);
        }

        if(close < open){
            generate(ans , curr+")" , open , close+1 , n);
        }
    }
}
