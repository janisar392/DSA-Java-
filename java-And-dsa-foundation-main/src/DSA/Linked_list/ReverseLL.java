package DSA.Linked_list;

public class ReverseLL {
    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public static Node reverseLL(Node head){
        if(head==null) return null;
        if(head.next==null) return head;

        Node newHead = reverseLL(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
