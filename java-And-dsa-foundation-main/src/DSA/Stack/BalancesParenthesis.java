package DSA.Stack;

import java.util.Stack;

public class BalancesParenthesis {

    public static boolean isbalanced(String str){

        Stack<Character> st = new Stack<>();
        int size = str.length();

        for(int i = 0 ; i < size ; i++){
            char ch = str.charAt(i);

            if(ch =='(' || ch =='{' || ch =='['){
                st.push(ch);
            }
            else {
                if(st.isEmpty()) return false;
                if(ch==')' && st.peek()=='(') st.pop();
                else if(ch=='}' && st.peek()=='{') st.pop();
                else if(ch==']' && st.peek()=='[') st.pop();
                else {
                    return false;
                }
            }
        }
        if(st.size() > 0){
            return false;
        }
        return true;
    }
}
