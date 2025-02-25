package DSA.Stack;

import java.util.Stack;

public class insertionn {
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(12);
        st.push(27);
        st.push(17);
        st.push(19);
        st.push(30);

        System.out.println("Stack elements : "+st);

        Stack rt = new Stack();

        int data=23;
        int idx =2;

        while (st.size()>idx){
            rt.push(st.pop());
        }
        st.push(data);

        while (rt.size()>0){
            st.push(rt.pop());
        }

        System.out.println("updated Stack : "+st);


    }
}
