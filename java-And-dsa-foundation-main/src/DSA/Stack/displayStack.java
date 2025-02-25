package DSA.Stack;

import java.util.Stack;

public class displayStack {

    public static void displayStackRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        displayStackRec(st);
        System.out.print(top+" ");
        st.push(top);
    }

    public static void displayReverseRec(Stack<Integer> st){
        if (st.size()==0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRec(st);
        st.push(top);
    }

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(12);
        st.push(27);
        st.push(17);
        st.push(19);
        st.push(30);

        displayStackRec(st);

        System.out.println();

        displayReverseRec(st);

    }
}
