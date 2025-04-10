package DSA.Stack;

import java.util.Stack;

public class RemoveKDigits {
    public String removeKDigits(String num, int k){

        Stack<Character> st = new Stack<>();

        for(char digit : num.toCharArray()){
            while (!st.isEmpty() && k>0 && st.peek() > digit){
                st.pop();
                k--;
            }
            st.push(digit);
        }

        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();

        while (sb.length() > 0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        return sb.length()==0 ? "0" : sb.toString();
    }
}
