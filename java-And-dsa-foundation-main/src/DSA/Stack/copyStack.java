package DSA.Stack;

import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(12);
        st.push(13);
        st.push(17);
        st.push(38);
        st.push(90);

        System.out.println("Stack Elements : "+st);

        //reverse

        Stack gt = new Stack();

        while (st.size()>0){
            gt.push(st.pop());
        }
        System.out.println("Stack middle stage :"+gt);
        // again reverse

        Stack rt = new Stack();
        while(gt.size()>0){
            rt.push(gt.pop());
        }

        System.out.println("Copy stack : "+rt);

    }
}
