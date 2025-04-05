package DSA.Linked_list;

public class palindromeLL {
    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val=val;
        }
    }
    public static Node reverse(Node head){
        if(head==null || head.next==null) return head;

        Node prev = null;
        Node after= null;
        Node curr = head;

        while(after!=null || curr!=null){
            after = curr.next;
            curr.next= prev;
            prev= curr;
            curr= after;
        }
        return prev;
    }

    public static boolean isPalindrome(Node head){
        if(head==null || head.next == null ) return true;

        Node slow =head;
        Node fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        Node temp = reverse(slow.next);

        Node t1= head;
        Node t2 =temp;

        while(t2!=null){
            if(t1.val!=t2.val) return false;
            t1= t1.next;
            t2= t2.next;
        }
        return true;
    }
}
