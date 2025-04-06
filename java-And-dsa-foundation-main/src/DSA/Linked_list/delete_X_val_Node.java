package DSA.Linked_list;

public class delete_X_val_Node {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node delete_x_val_Node(Node head , int x){
        Node curr = head;

        while(curr!=null){
            if(curr.data==x){
                if(curr==head){
                    head = curr.next;
                    if(head!=null){
                        head.prev=null;
                    }
                }
                else{
                    curr.prev.next = curr.next;
                    if(curr.next!=null){
                        curr.next.prev = curr.prev;
                    }
                }
            }
            curr = curr.next;
        }
        return head;
    }
}
