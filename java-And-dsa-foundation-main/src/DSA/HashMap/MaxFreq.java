package DSA.HashMap;

import java.util.*;

public class MaxFreq {
    public static void main(String[] args) {
        int[] arr= {1,2,4,4,2,3,4,6,4,2,3,5,2,2,6,2,9};

        Map<Integer,Integer> freq = new HashMap<>();

        for(int e : arr){
            if(!freq.containsKey(e)){
                freq.put(e,1);
            }
            else{
                freq.put(e, freq.get(e)+1);
            }
        }
        System.out.println(freq.entrySet());

        int Maxfreq = 0 , ansKey =-1;

        for(var key : freq.keySet()){
            if(freq.get(key)> Maxfreq){
                Maxfreq = freq.get(key);
                ansKey = key;
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times",ansKey ,Maxfreq);
    }
}
