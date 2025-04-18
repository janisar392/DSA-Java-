package DSA.String;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FreqSort {
    public String frequencySort(String s){
        Map<Character, Integer> freqMap = new HashMap<>();

        for(char ch : s.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
                (a,b) -> freqMap.get(b) - freqMap.get(a)
        );
        maxHeap.addAll(freqMap.keySet());

        StringBuilder ans = new StringBuilder();
        while (!maxHeap.isEmpty()){
            char ch = maxHeap.poll();
            int freq = freqMap.get(ch);
            for(int i=0 ; i< freq ;i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
