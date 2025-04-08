package DSA.Stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();

    public MinStack(){
        // constructor
    }
    public void push(int x){
        if(st.size()==0){
            st.push(x);
            minSt.push(x);
        }
        else{
            st.push(x);
            if(minSt.peek() < x) minSt.push(minSt.peek());
            else minSt.push(x);
        }
    }
    public void pop(){
        st.pop();
        minSt.pop();
    }
    public int top(){
        return st.peek();
    }

    public int minVal(){
        return minSt.peek();
    }
}
