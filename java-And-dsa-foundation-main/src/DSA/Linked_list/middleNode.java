package DSA.Linked_list;

public class middleNode {
    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val =val;
        }
    }

    public static Node MiddleNode(Node head){
        Node slow= head;
        Node fast= head;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
