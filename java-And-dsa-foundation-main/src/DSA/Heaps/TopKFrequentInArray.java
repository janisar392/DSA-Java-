package DSA.Heaps;
import java.util.*;

public class TopKFrequentInArray {
    public ArrayList<Integer> topKFrequent(int[] arr, int k) {
        // Your code here
        Map<Integer, Integer> map =new HashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0)+1);
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) ->{
            if(a[1] != b[1]) return b[1] - a[1];
            return b[0] - a[0];
        });

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            maxHeap.add(new int[]{entry.getKey() , entry.getValue()});

        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(k > 0 && !maxHeap.isEmpty()){
            ans.add(maxHeap.poll()[0]);
            k--;
        }
        return ans;
    }
}
