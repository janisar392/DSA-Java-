package DSA.Linked_list;

public class doublyLL {

    public static class Node {
        int val;
        Node next;
        Node prev;

        public Node (int val){
            this.val = val;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void display2(Node random){
        Node temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }
        display(temp);
    }

    public static void Displayrev(Node tail){

        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node a = new Node(12);
        Node b = new Node(23);
        Node c = new Node(45);
        Node d = new Node(47);
        Node e = new Node(78);

        a.prev=null;

        a.next=b;
        b.prev=a;

        b.next=c;
        c.prev=b;

        c.next=d;
        d.prev=c;

        d.next=e;
        e.prev=d;

        e.next=null;


        display(a);
        System.out.println();

        Displayrev(e);

        System.out.println("display all by random node : ");
        display2(d);
    }





}
