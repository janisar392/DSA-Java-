package DSA.Linked_list;

public class RemoveNthNodeFromLAst {

    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public static Node removeNthNodeFromLast(Node head , int n){

        Node slow = head;
        Node fast = head;

        for(int i=1 ; i<=n ;i++){
            fast = fast.next;
        }

        if(fast==null){
            head=head.next;
            return head;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast= fast.next;
        }

        slow.next= slow.next.next;

        return head;
    }
}
