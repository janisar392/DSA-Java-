package DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String str ){

        Stack<Character> st = new Stack<>();
        int n = str.length();

        for(int i=0 ; i<n ; i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            if(ch==')'){
                if(st.size()==0) return false;
                if(st.peek()=='(') st.pop();
            }
            if(ch=='}'){
                if(st.size()==0) return false;
                if(st.peek()=='{') st.pop();
            }
            if(ch==']'){
                if(st.size()==0) return false;
                if(st.peek()=='[') st.pop();
            }
        }
        if(st.size()>0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = scanner.nextLine();

        System.out.println(isValid(str));

    }
}
