package DSA.Linked_list;

public class RotateRight {
    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public static Node rotateRight(Node head, int k){
        // edge case
        if(head==null || head.next==null || k==0) return head;
        //if k is more than length of Ll than skip the unnecessary rotation

        int length =1;
        Node temp =head;
        while(temp.next!=null){
            length++;
            temp = temp.next;
        }
        k = k % length;
        if(k==0 ) return head;

        Node slow =head;
        Node fast = head;

        for(int i=1 ; i<=k ; i++){
            fast = fast.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast= fast.next;
        }
        Node newHead = slow.next;
        slow.next = null;

        fast.next= head;
        head = newHead;

        return head;
    }
}
