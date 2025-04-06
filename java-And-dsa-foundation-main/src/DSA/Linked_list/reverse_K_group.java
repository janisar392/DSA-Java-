package DSA.Linked_list;

public class reverse_K_group {
    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val =val;
        }
    }
    private static Node reverseLL(Node head){
        if(head==null || head.next==null) return head;
        Node curr =head;
        Node prev =null;

        while (curr != null){
            Node after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    private static Node getKthNode(Node temp, int k) {
        for(int i =1 ; i< k && temp!=null ;i++){
            temp = temp.next;
        }
        return temp;
    }

    public static Node reverseKGroup(Node head, int k){
        Node temp = head;
        Node prev = null;

        while (temp!= null){
            Node KthNode = getKthNode(temp,k);

            if(KthNode == null){
                if(prev!=null){
                    prev.next =temp;
                }
                break;
            }
            Node nextNode = KthNode.next;
            KthNode.next=null;

            reverseLL(temp);
            if(temp == head){
                head =KthNode;
            }else {
                prev.next =KthNode;
            }
            prev =temp;
            temp = nextNode;
        }
        return head;
    }
}
