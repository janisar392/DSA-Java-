package DSA.Heaps;

import java.util.PriorityQueue;

public class replaceElemWithRank {

    public static int[] replaceWithRank(int arr[]  , int N){

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a,b) ->{
                    if(a[0] != b[0]) return a[0] -b[0];
                    return a[1] - b[1];
                }
        );

        for (int i=0 ; i< N ; i++){
            minHeap.add(new int[]{arr[i] , i});
        }
        int[] ans = new int[N];
        int rank =1;
        int prev = Integer.MIN_VALUE;

        while(!minHeap.isEmpty()){
            int[] curr = minHeap.poll();
            int val = curr[0];
            int idx = curr[1];

            if(val != prev){
                ans[idx] = rank;
                prev = val;
                rank++;
            }else{
                ans[idx] = rank-1;
            }
        }
        return ans;
    }
}
