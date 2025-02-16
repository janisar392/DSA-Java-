package DSA.Linked_list;



public class Impliment {

    public static class Node{               // Node structure
        int data;
        Node next;

        public Node(int data){              // constructor
            this.data=data;
        }
    }

    public static class linkedList{
        Node head = null;
        Node tail = null;

        public void display(){
            Node temp = head;
            while (temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        public int size(){
            Node temp = head;
            int count =0;
            while (temp!=null){
                temp = temp.next;
                count++;
            }
            return count;
        }

        public void InsertAtEnd(int val){

            Node temp = new Node(val);
            if(head==null){
                head =temp;
                tail=temp;
            }else {
                tail.next =temp;
                tail = temp;
            }
        }

        public void InsertAtStart(int val){

            Node temp = new Node(val);

            if(head==null){
                head = temp;
                tail= temp;
            }else {
                temp.next=head;
                head=temp;
            }
        }

        public void InsertAtIdx(int idx , int val){

            Node temp = new Node(val);

            if(idx==size()){
                InsertAtEnd(val);
                return;
            }

            if(idx==0){
                InsertAtStart(val);
                return;
            }

            if(idx<0 || idx > size()){
                System.out.println("Wrong index ");
                return;
            }

            Node trav = head;

            for(int i=1;i<=idx-1;i++){
                trav = trav.next;
            }
            temp.next=trav.next;
            trav.next=temp;
        }

        public void deleteAtIndex(int idx){

            if(idx==0){
                head= head.next;
                return;
            }

            Node temp= head;

            for(int i=1; i<=idx-1;i++){
                temp = temp.next;
            }
            temp.next= temp.next.next;
            tail= temp;
        }
    }


    public static void main(String[] args) {

        linkedList ll = new linkedList();

        ll.InsertAtStart(23);    //  23
        ll.InsertAtEnd(34);      //  23 34
        ll.InsertAtIdx(0,12);//  12 23 34
        ll.InsertAtIdx(3,56);//  12 23 34 56
        ll.InsertAtIdx(2,32);//  12 23 32 34 56
        ll.deleteAtIndex(1);     //  12 32 34 56
        ll.deleteAtIndex(0);     //  32 34 56
        ll.deleteAtIndex(2);     //  32 34

        ll.display();
    }
}
