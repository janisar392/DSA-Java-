package DSA.Stack;

import java.util.Stack;

public class reverseStack {

    public static void pushAtBottom(Stack<Integer> st , int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }

    public static void reverse(Stack<Integer> st){
        if(st.size()==0) return;

        int top =st.pop();
        reverse(st);
        pushAtBottom(st , top);
    }


    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(12);
        st.push(34);
        st.push(18);
        st.push(19);
        st.push(49);

        System.out.println("Stack : "+ st);

//
//        Stack ft = new Stack();
//
//        while (st.size()>0){
//            ft.push(st.pop());
//        }
//
//    //    System.out.println("ft : "+ft);
//
//        Stack dt = new Stack<>();
//
//        while (ft.size()>0){
//            dt.push(ft.pop());
//        }
//    //    System.out.println(dt);
//
//        while(dt.size()>0){
//            st.push(dt.pop());
//        }
//
//        System.out.println("Reverse Stack : "+st);
//


        System.out.println("Reverse Stack from recursion :");
        reverse(st);
        System.out.println(st);



    }
}
