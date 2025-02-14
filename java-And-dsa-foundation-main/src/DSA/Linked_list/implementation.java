package DSA.Linked_list;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head==null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }

        }
        void insertAtHead(int val){
            Node temp = new Node(val);
                if(head==null){  // empty list
                 //   head=tail=temp;
                  //or
                  insertAtEnd(val);
                }
                else{  // non-empty list
                    temp.next= head;
                    head = temp;
                }
        }
        void insertAt(int idx , int val){
            Node t= new Node(val);
            Node temp = head ;
            if (idx==size()){
                insertAtEnd(val);
                return;
            } else if (idx==0) {
                insertAtHead(val);
                return;
            } else if (idx<0|| idx>size()) {
                System.out.println("invalid index !");
                return;
            }
            for (int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t ;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            Node temp = head;
            int count = 0;
            while(temp!= null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
        l1.insertAtEnd(4);  //4
        l1.display();
        l1.insertAtEnd(5);  //4 5
        l1.display();
        l1.insertAtEnd(8);  //4 5 8
        l1.display();

        l1.insertAtHead(12);
        l1.display();
        l1.insertAt(-2,26);
        l1.display();
   //     System.out.println(l1.size());

    }
}
