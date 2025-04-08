package DSA.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackImpl_Queue {
    Queue<Integer> queue = new LinkedList<>();

    public StackImpl_Queue(){
        //Constructor
    }

    public void push(int x){
        if(queue.size()==0) queue.add(x);

        else{
            queue.add(x);
            for(int i =1 ; i<= queue.size()-1 ; i++){
                queue.add(queue.remove());
            }
        }
    }

    public int pop(){
        return queue.remove();
    }

    public int top(){
        return queue.peek();
    }

    public boolean isEmpty(){
        if(queue.size()==0) return true;
        return false;
    }
}
