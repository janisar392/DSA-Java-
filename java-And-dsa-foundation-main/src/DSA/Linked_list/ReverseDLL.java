package DSA.Linked_list;

public class ReverseDLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node reverseDLL(Node head){

        if(head==null || head.next==null) return head;

        Node curr = head;
        Node newHead = null;

        while(curr!=null){
            Node temp = curr.next;
            curr.next = curr.prev;
            curr.prev =temp;

            newHead = curr;     //lastNode

            curr = temp;   // reverse next element
        }
        return newHead;
    }
}
