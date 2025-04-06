package DSA.Linked_list;

public class removeDuplicates {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node removeDuplicateNode(Node head){
        if(head==null || head.next==null ) return  head;

        Node curr = head;

        while(curr!=null && curr.next!=null){
            if(curr.data == curr.next.data){
                Node nextNode = curr.next.next;

                curr.next =nextNode;
                if(nextNode!=null){
                    nextNode.prev = curr;
                }
            }
            else curr = curr.next;
        }
        return head;
    }
}
