package DSA.Linked_list;

public class CopyRandomList {

    public static class Node{
        int val;
        Node next;
        Node random;

        public Node(int val){
            this.val = val;
        }
    }

    public static Node copy_randomList(Node head1){

        Node head2 = new Node(-1);

        Node temp1 = head1;
        Node temp2 = head2;

        if(head1 == null) return null;

        //creating deep copy
        while(temp1!= null){
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = t;
            temp1 = temp1.next;
        }
        // alternate connection
        head2 = head2.next;

        temp1= head1;
        temp2 =head2;

        Node temp = new Node(-1);
        while(temp1 != null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }

        //Assign random pointer
        temp1 = head1;
        temp2 = head2;

        while (temp!=null && temp2 != null){
            if(temp1.random==null){
                temp2.random= null;
            }
            else{
                temp2.random = temp1.random.next;
            }

            temp1 = temp2.next;
            if(temp1 !=null) temp2 = temp1.next;
        }
        temp1 = head1;
        temp2 = head2;

        //seprating the list
        while(temp1!=null){
            temp1.next = temp2.next;
            temp1 = temp1.next;

            if(temp1==null) break;

            temp2.next = temp1.next;
            if(temp2 == null ) break;
            temp2=temp2.next;
        }
        return head2;
    }
}
