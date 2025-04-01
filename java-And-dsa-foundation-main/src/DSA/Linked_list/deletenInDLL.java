package DSA.Linked_list;

public class deletenInDLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data =data;
        }
    }

    public static Node deleteNode(Node head , int p){
        if(head==null || p<=0) return head;



        if(p== 1){
            Node newhead = head.next;
            if(newhead != null){
                newhead.prev =null;
            }
            return newhead;
        }
        Node curr = head;
        int count =1;
        while(curr!=null && count <p){
            curr = curr.next;
            count++;
        }
        if(curr==null){
            return head;
        }

        //last Node
        if(curr.next ==null){
            curr.prev.next =null;
        }else{  // at any position
            curr.prev.next = curr.next;
            curr.next.prev =curr.prev;
        }
        return head;
    }
}
