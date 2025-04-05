package DSA.Linked_list;

public class AddOne {
    public static class Node{
        int val ;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public static Node reverse(Node head){

        Node curr = head;
        Node prev = null;

        while(curr!=null){
            Node after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public static Node add1(Node head){

        head = reverse(head);

        Node curr = head;
        int carry = 1;

        while(curr != null){
            int sum = curr.val + carry;
            curr.val = sum%10;
            carry = sum/10;

            if(carry == 0) break;

            if(curr.next == null && carry > 0){
                curr.next = new Node(0);
            }
            curr = curr.next;
        }
        return reverse(head);
    }
}
