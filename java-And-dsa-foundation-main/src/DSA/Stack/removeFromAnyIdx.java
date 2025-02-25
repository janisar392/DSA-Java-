package DSA.Stack;

import java.util.Stack;

public class removeFromAnyIdx {

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(12);
        st.push(27);
        st.push(17);
        st.push(19);
        st.push(30);

        System.out.println("Stack elements are : "+st);

        Stack rt = new Stack();
        int idx= 2;


        while(st.size()>idx+1){
            rt.push(st.pop());
        }
        st.pop();

        while (rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println("After removing from idx "+idx+" : "+st);

    }

}
