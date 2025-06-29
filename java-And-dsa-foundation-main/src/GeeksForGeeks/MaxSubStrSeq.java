package GeeksForGeeks;

import java.util.Stack;

public class MaxSubStrSeq {
    public static String maxSubStrSeq(String s , int k){
        int n = s.length();
        int keep = n-k;
        Stack<Character> st = new Stack<>();

        for(int i=0 ; i< n ;i++){
            char ch = s.charAt(i);

            while(!st.isEmpty() && st.peek() < ch && st.size() +(s.length()-i-1) >= keep){
                st.pop();
            }
            if(st.size() < keep){
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char c : st){
            ans.append(c);
        }
        return ans.toString();
    }
}
