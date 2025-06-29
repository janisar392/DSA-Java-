package GeeksForGeeks;

import java.util.LinkedList;
import java.util.Queue;

public class PoliceThief {
    public static int PoliceThief(int[] arr , int k){
        int n = arr.length;
        int count =0 ;

        Queue<Integer> police = new LinkedList<>();
        Queue<Integer> thief  = new LinkedList<>();

        for(int i =0 ; i< n ; i++){
            if(arr[i]=='P'){
                police.add(i);
            }
            else{
                thief.add(i);
            }
        }
        while(!police.isEmpty() && !thief.isEmpty()) {
            int p = police.peek();
            int t = thief.peek();

            if (Math.abs(p - t) <= k) {
                count++;
                police.poll();
                thief.poll();
            } else if (t < p) {
                thief.poll();
            } else {
                police.poll();
            }
        }

        return count;
    }
}
