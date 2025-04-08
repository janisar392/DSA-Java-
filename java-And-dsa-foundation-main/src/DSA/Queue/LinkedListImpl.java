package DSA.Queue;

public class LinkedListImpl {
    public static class QNode{
        int val;
        QNode next;

        public QNode(int val){
            this.val = val;
        }
    }

    QNode rear , front;

    public void push(int x){
        QNode newNode = new QNode(x);

        if(rear==null){
            rear = front = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int pop(){
        if(front ==null{
            return -1;
        }

        int data = front.val;
        front = front.next;

        if(front==null) rear =null;

        return data;
    }

}
