package DSA.Linked_list;

public class ContructLLFromArray {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }

    public static Node constructLL(int[] arr){
        if(arr==null || arr.length==0) return null;

        Node head = new Node(arr[0]);
        Node curr = head;

        for(int i=1 ;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            curr.next = newNode;
            curr = newNode;
        }
        return head;
    }
}
