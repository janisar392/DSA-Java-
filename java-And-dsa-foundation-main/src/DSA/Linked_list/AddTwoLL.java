package DSA.Linked_list;

public class AddTwoLL {
    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
        }
    }

    public static Node addTwoNode(Node a , Node b){
        Node temp = new Node(0);
        Node curr = temp;
        int carry =0;

        while(a !=null || b!=null || carry != 0){
            int val1 = (a!=null) ? a.val : 0;
            int val2 = (b!=null) ? b.val : 0;
            int sum = val1 + val2 + carry;

            carry = sum/10;
            curr.next = new Node(sum%10);

            curr = curr.next;

            if(a != null ) a = a.next;
            if(b != null ) b = b.next;

        }
        return temp.next;
    }
}
