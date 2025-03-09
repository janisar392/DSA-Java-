package DSA.Queue;

public class LLImpl {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
    }

    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x){
            Node temp = new Node(x);
            if(size==0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is empty ");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
        public void display(){

            if(size==0){
                System.out.println("Queue is empty");
                return;
            }

            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        queueLL q = new queueLL();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.display();

        q.remove();
        q.display();

        System.out.println(q.peek());

        System.out.println(q.isEmpty());
    }
}
