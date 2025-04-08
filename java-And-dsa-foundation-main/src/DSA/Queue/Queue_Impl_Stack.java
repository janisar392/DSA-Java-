package DSA.Queue;

import java.util.Stack;

public class Queue_Impl_Stack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public Queue_Impl_Stack(){

    }

    public void add(int x){
        st.add(x);
    }

    public int remove(){
        while (st.size() > 1){
            helper.push(st.pop());
        }
        int a = st.pop();
        while(helper.size() > 0){
            st.push(helper.pop());
        }
        return a;
    }

    public int top(){
        while (st.size() > 1){
            helper.push(st.pop());
        }
        int a = st.peek();
        while(helper.size() > 0){
            st.push(helper.pop());
        }
        return a;
    }

    public boolean isStack(){
        if(st.size()==0) return true;
        return false;
    }
}
