package DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {

    public static boolean isBalanced(String str){

        Stack<Character> st = new Stack<>();
        int n = str.length();

        for(int i =0 ; i<n ; i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else // ch==')'
            {
               if(st.size()==0) return false;
               if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0) return false;
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack st = new Stack();

        System.out.println("Enter String : ");
        String str = scanner.nextLine();

        System.out.println(isBalanced(str));
    }
}
