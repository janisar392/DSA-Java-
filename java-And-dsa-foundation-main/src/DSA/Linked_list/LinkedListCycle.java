package DSA.Linked_list;

public class LinkedListCycle {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data =data;
        }
    }
    public static boolean CheckCycle(Node head){
        if(head==null || head.next==null) return false;

        Node slow =head;
        Node fast =head;

        while(fast!=null){
            slow = slow.next;
            if(fast.next==null) return false;
            fast= fast.next.next;

            if(fast==slow) return true;
        }
        return false;
    }
}
