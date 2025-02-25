package LeetCode;

import java.util.Stack;

public class Solution_155 {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> mt = new Stack<>();

    public Solution_155(){

    }
    public void push(int val){
        if(st.size()==0) {
            st.push(val);
            mt.push(val);
        }
        else {
            st.push(val);
            if(mt.peek()<val ) mt.push(mt.peek());
            else mt.push(val);
        }
    }

    public void pop(){
        st.pop();
        mt.pop();
    }
    public int top(){
        return st.peek();
    }

    public int getMin(){
        return mt.peek();
    }
}
