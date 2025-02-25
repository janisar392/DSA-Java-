package DSA.Stack;

import java.util.Stack;

public class basics {
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(12);
        st.push(23);
        st.push(56);
        st.push(67);

        System.out.println("Stack element : "+ st);

        st.pop();
        System.out.println("Stack element after delete : "+ st);


        System.out.println("top element "+   st.peek());
        System.out.println("stack empty :" +st.isEmpty());
    }
}
