package DSA.Graph.SortestPathAlgo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumMultiplication {

    private static final int MOD = 100000;

    int minimumMultiplications(int[] arr, int start, int end) {

        if(start == end) return 0;

        int[] dist = new int[MOD];
        for(int num : dist) Arrays.fill(dist, Integer.MAX_VALUE);

        Queue<Integer> q = new LinkedList<>();
        q.offer(start);

        while (!q.isEmpty()){
            int curr =q.poll();

            for(int num : arr){
                int next = (curr * num )%MOD;
                if(dist[curr]+1 < dist[next]){
                    dist[next] = dist[curr]+1;

                    if(next == end) return dist[next];

                    q.offer(next);
                }
            }
        }
        return -1;
    }
}
