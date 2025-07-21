package DSA.Graph.SortestPathAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dijkstra {
    public int[] dijkstra(int V, int[][] edges, int src) {

        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i =0 ; i< V ; i++)  adj.add(new ArrayList<>());
        for(int[] edge : edges){
            int u = edge[0], v =edge[1], w = edge[2];
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] =0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        pq.offer(new int[]{0,src});

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int currDist = curr[0];   //curr shortest distance
            int x = curr[1];          // curr node

            for(int[] it : adj.get(x)){
                int y = it[0];            // neighbor node
                int wt = it[1];           // weight

                if(currDist + wt < dist[y]){
                    dist[y] = currDist+wt;
                    pq.offer(new int[]{dist[y] , y});
                }

            }
        }
        return dist;
    }
}
