package DSA.Linked_list;

public class AddNodeDLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node addNodeDLL(Node head , int p ,int x){

        Node newNode = new Node(x);

        // insert at beginning
        if(p==0){
            newNode.next=head;
            if(head!=null){
                head.prev=newNode;
            }
            return newNode;
        }

        // At any position

        Node curr = head;
        int count =0;

        //traverse till position p

        while(curr!=null && count < p){
            curr =curr.next;
            count++;
        }
        if(curr==null){
            return head;
        }

        newNode.next = curr.next;
        newNode.prev = curr;
        if(curr.next!=null){
            curr.next.prev = newNode;
        }
        curr.next = newNode;

        return head;
    }
}
