package DSA.Linked_list;

public class constructDLLFromArr {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
        }
    }

    public static Node ContructDLL(int[] arr){

        Node head= new Node(arr[0]);
        Node curr = head;

        for(int i=1 ;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            curr.next = newNode;
            newNode.prev=curr;

            curr=newNode;
        }
        return head;
    }
}
