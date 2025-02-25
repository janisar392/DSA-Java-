package DSA.Stack;

public class linkedListImpl {
    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
    public static class Stack{
        private Node head = null;
        private int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next =head;
            head = temp;
            size++;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is Empty!");
            }
            int x= head.val;
            head= head.next;
            size--;
            return x;
        }
        void displayRev(){
            Node temp = head;

            while (temp!=null){
                System.out.print(temp.val+" ");
                temp =temp.next;
            }
            System.out.println();
        }
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }

        void display(){
            displayrec(head);
            System.out.println();
        }
        int size(){
            return size;
        }

        int peak(){
            return head.val;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(12);
        st.push(17);
        st.push(19);
        st.push(21);
        st.push(10);

        st.display();

        st.pop();
        st.display();
        System.out.println(st.size());
        System.out.println(st.peak());
    }
}
