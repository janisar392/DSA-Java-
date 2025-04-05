package DSA.Linked_list;

public class SortLL {
    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
        }
    }
    public static Node merge(Node l1 , Node l2){
        Node dummy = new Node(0);
        Node curr = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }
            else {
                curr.next= l2;
                l2 =l2.next;
            }
            curr = curr.next;
        }
        if(l1 != null ) curr.next =l1;
        if(l2 != null ) curr.next =l2;

        return dummy.next;
    }

    public static Node getMidElem(Node head){
        Node slow=head;
        Node fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node sortLL(Node head){
        if(head== null || head.next== null){
            return head;
        }

        Node mid = getMidElem(head);
        Node left = head;
        Node right= mid.next;
        mid.next=null;

        left = sortLL(left);
        right =sortLL(right);

        return merge(left,right);
    }
}
