package DSA.Heaps;
import java.util.*;

public class K_LargestElement {

    public ArrayList<Integer> kLargest(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i =0 ; i< arr.length ; i++){

            minHeap.add(arr[i]);

            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!minHeap.isEmpty()){
            ans.add(minHeap.poll());
        }
        Collections.reverse(ans);
        return ans;
    }
}
