package DSA.Heaps;

import java.util.*;

class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}

public class mergeKLists {

    Node mergeKList(List<Node> arr){
        if(arr == null || arr.size() == 0) return null;

        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> a.data - b.data);
        for(Node node : arr)
            if(node != null) pq.add(node);

        Node dummy = new Node(0);
        Node tail = dummy;

        while(!pq.isEmpty()){
            Node minNode = pq.poll();
            tail.next = minNode;
            tail = tail.next;

            if(minNode.next != null){
                pq.add(minNode.next);
            }
        }
        return dummy.next;
    }
}
