package DSA.Linked_list;

public class nthNodeFromEnd {


    public static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public Node reverseNode(Node head){

        Node after = null;
        Node prev = null;
        Node curr = head;

        while(after!=null || curr!=null){

            after = curr.next;
            curr.next= prev;
            prev = curr;
            curr= after;
        }
        return prev;
    }

    public static Node nthNode(Node head , int n){

        Node slow = head;
        Node fast = head;

        for(int i =1 ; i<= n ; i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {

        Node a = new Node(23);
        Node b = new Node(34);
        Node c = new Node(56);
        Node d = new Node(87);
        Node e = new Node(47);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;              //23 34 56 87 47

        Node q = nthNode(a,2);
        System.out.println(q.data);
    }
}
