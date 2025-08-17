package DSA.Heaps;
import java.util.*;

public class MinCostOfRopes {

    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : arr) minHeap.add(num);

        int TotalMinCost =0;

        while(minHeap.size() > 1){
            int rope1 = minHeap.poll();
            int rope2 = minHeap.poll();
            int newRope = rope1 + rope2;

            TotalMinCost += newRope;
            minHeap.add(newRope);
        }
        return TotalMinCost;
    }
}
