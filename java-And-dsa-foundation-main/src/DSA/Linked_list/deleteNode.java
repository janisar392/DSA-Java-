package DSA.Linked_list;

public class deleteNode {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    public static Node DeleteNode(Node node){
        node.data =node.next.data;
        node.next= node.next.next;
        return node;
    }
}
