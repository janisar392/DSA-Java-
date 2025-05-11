package DSA.Array.Ques;

import java.util.PriorityQueue;

public class KthlargestSum {
    public static int KthLargest(int[] arr ,int k){
        int n = arr.length;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0 ; i< n ;i++){
            int sum =0;
            for(int j=i ; j < n ; j++){
                sum += arr[j];

                if(minHeap.size() < k){
                    minHeap.offer(sum);
                }
                else if(sum > minHeap.peek()){
                    minHeap.poll();
                    minHeap.offer(sum);
                }
            }
        }
        return minHeap.peek();
    }
}
