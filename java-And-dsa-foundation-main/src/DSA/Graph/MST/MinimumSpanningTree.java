package DSA.Graph.MST;
import java.util.*;

public class MinimumSpanningTree {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] -b[0]);

        boolean[] visited = new boolean[V];
        int mstWt = 0;

        pq.offer(new int[]{0,0});

        while (!pq.isEmpty()){
            int[] curr = pq.poll();
            int wt = curr[0];
            int node = curr[1];

            if(visited[node]) continue;
            visited[node] = true;
            mstWt += wt;

            for(int[] it : adj.get(node)){
                int adjNode = it[0];
                int edgeWt = it[1];
                if(!visited[adjNode]){
                    pq.offer(new int[]{edgeWt,adjNode});
                }
            }
        }
        return mstWt;
    }
}
