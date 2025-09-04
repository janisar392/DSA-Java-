package DSA.GreedyAlgo;

import java.util.Arrays;

public class minIntervalsRemove {

    public int minRemoval(int intervals[][]){
        int n = intervals.length;

        Arrays.sort(intervals , (a,b) -> Integer.compare(a[1] , b[1]));

        int count =0;
        int lastEnd = Integer.MIN_VALUE;

        for(int[] interval : intervals){
            if(interval[0] >= lastEnd){
                count++;
                lastEnd = interval[1];
            }
        }
        return n - count;
    }
}
