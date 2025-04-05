package DSA.Linked_list;

public class countNodesinLoop {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    public static int NodeLoop(Node loopNode){
        Node temp = loopNode;
        int count =1;

        while(temp.next != loopNode){
            count++;
            temp= temp.next;
        }
        return count;
    }

    public static int CountNodesinLoop(Node head){

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                return NodeLoop(slow);
            }
        }
        return 0;
    }
}
