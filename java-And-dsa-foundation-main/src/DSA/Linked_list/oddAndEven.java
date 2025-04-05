package DSA.Linked_list;

public class oddAndEven {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data =data;
        }
    }

    public static Node placedOddAndEven(Node head){

        Node odd = new Node(0);
        Node even = new Node(0);

        Node temp =head;
        Node tempo= odd;
        Node tempe= even;

        while (temp!=null){
            tempo.next = temp;
            temp = temp.next;
            tempo =tempo.next;

            tempe.next = temp;
            if(temp==null) break;
            temp = temp.next;
            tempe =tempe.next;
        }
        odd = odd.next;
        even= even.next;
        tempo.next=even;

        return odd;
    }
}
