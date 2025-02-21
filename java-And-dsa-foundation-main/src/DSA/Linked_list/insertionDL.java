package DSA.Linked_list;

public class insertionDL {

    public static class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
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

    public static Node insertAtHeadDl(Node head ,int x){
        Node temp = new Node(x);
        temp.next = head;
        head.prev =temp;
        head = temp;

        return head;
    }

    public static void insertAtEnd(Node head  , int x){

        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t ;
        t.prev = temp.next;
        t = temp.next;
    }

    public static void insertAtIdx(Node head , int idx , int data){

        Node temp = head;
        for(int i = 1 ; i<= idx-1 ; i++){
            temp = temp.next;
        }
        Node t = new Node(data);

        t.next=temp.next;
        temp.next.prev =t;
        temp.next =t;
        t.prev=temp;
    }

    public static void deleteAtIdx(Node head , int idx){


        Node temp = head;
        for(int i = 1 ; i<=idx-1 ; i++){
            temp = temp.next;
        }

        temp.next=temp.next.next;
        temp.next.prev = temp;

    }


    public static void main(String[] args) {

       Node a = new Node(23);
       Node b = new Node(45);
       Node c = new Node(78);
       Node d = new Node(90);
       Node e = new Node(28);



        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;


        display(a);
        System.out.println();

//        Node newHead = insertAtHeadDl(a,34);
//        display(newHead);

//        insertAtEnd(a,34);
//        display(a);
//
//        insertAtIdx(a,3,19);
//        display(a);

        deleteAtIdx(a,3);
        display(a);

    }
}
