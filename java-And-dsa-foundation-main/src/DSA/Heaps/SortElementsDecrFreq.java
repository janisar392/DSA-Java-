package DSA.Heaps;
import java.util.*;

public class SortElementsDecrFreq {

    public ArrayList<Integer> sortByFreq(int arr[]) {

        Map<Integer , Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num , map.getOrDefault(num ,0 )+1);
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) ->{
            if(a[1] != b[1]) return b[1] - a[1];
            return a[0] - b[0];
        });

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            maxHeap.add(new int[]{entry.getKey() , entry.getValue()});
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while(!maxHeap.isEmpty()){
            int[] curr = maxHeap.poll();
            int digit = curr[0];
            int count = curr[1];

            for(int i =0 ; i< count ; i++){
                ans.add(digit);
            }
        }
        return ans;
    }
}
