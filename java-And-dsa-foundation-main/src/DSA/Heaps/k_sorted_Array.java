package DSA.Heaps;

import java.util.*;

public class k_sorted_Array {
    static String isKSortedArray(int arr[], int n, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i< n ; i++){
            map.put(arr[i] , i);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int minIndex =0;

        for(int i=0 ; i< Math.min(k+1 ,n ) ; i++){
            minHeap.add(arr[i]);
        }
        for(int i =k+1 ; i < n ; i++){
            int smallest = minHeap.poll();
            int originalIndex = map.get(smallest);

            if(Math.abs(originalIndex-minIndex) > k){
                return "No";
            }
            minIndex++;
            minHeap.add(arr[i]);
        }

        while (!minHeap.isEmpty()){
            int smallest = minHeap.poll();
            int originalIndex = map.get(smallest);

            if(Math.abs(originalIndex-minIndex) > k){
                return "No";
            }
            minIndex++;
        }
       return "Yes";
    }
}
