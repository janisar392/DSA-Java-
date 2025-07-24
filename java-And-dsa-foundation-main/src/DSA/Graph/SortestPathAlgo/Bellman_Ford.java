package DSA.Graph.SortestPathAlgo;
import java.util.*;

public class Bellman_Ford {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        // code here
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] =0;
        // Relax all edges V-1;
        for(int i=0; i< V ; i++){
            for(int[] edge : edges){
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];

                if(dist[u] != Integer.MAX_VALUE && dist[u]+ w < dist[v]){
                    dist[v] = dist[u]+w;
                }
            }
        }
        // check it for negative cycle weight

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if(dist[u] != Integer.MAX_VALUE && dist[u]+ w < dist[v]){
                return new int[]{-1};
            }
        }
        for(int i=0 ; i< V ; i++){
            if(dist[i] == Integer.MAX_VALUE){
                dist[i] = 10000_0000;
            }
        }

        return dist;
    }
}
