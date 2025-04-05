package DSA.Linked_list;

public class Sort_0_1_2 {
    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public static Node segrigate(Node head){
        Node sort0 = new Node(-1);
        Node sort1 = new Node(-1);
        Node sort2 = new Node(-1);

        Node temp0 = sort0;
        Node temp1 = sort1;
        Node temp2 = sort2;

        Node curr = head;

        while(curr!=null){
            if(curr.val==0){
                temp0.next=curr;
                temp0=temp0.next;
            }
            else if (curr.val==1){
                temp1.next=curr;
                temp1=temp1.next;
            }
            else{
                temp2.next=curr;
                temp2=temp2.next;
            }
            curr = curr.next;
        }
        temp0.next = (sort1.next != null) ? sort1.next : sort2.next;
        temp1.next = sort2.next;
        temp2.next = null;

        return sort0.next;
    }
}
