package DSA.Heaps;
import java.util.*;

public class kClosestPointsToOrigin {

    public int[][] kClosest(int[][] points, int k) {
        // Your code here
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) ->{
            int distA = a[0]*a[0] + a[1]*a[1];
            int distB = b[0]*b[0] + b[1]*b[1];
            return distB - distA;
        });

        for(int[] p : points){
            maxHeap.add(p);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int[][] ans = new int[k][2];
        int idx =0;
        while(!maxHeap.isEmpty()){
            ans[idx++] = maxHeap.poll();
        }

        return ans;
    }
}
