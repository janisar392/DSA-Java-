package DSA.Graph.SortestPathAlgo;
import java.util.*;

public class ShortestPathInWeightedUndirectedGraph {

    public List<Integer> shortestPath(int n, int m, int[][] edges) {

        List<List<int[]>> adj = new ArrayList<>();
        for(int i =0 ; i<= n ; i++) adj.add(new ArrayList<>());
        for(int[] edge : edges){
            int u = edge[0], v= edge[1], w= edge[2];
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }
        int[] dist = new int[n+1];
        int[] parent = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        for(int i=1 ; i<= n ; i++) parent[i] =i;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]- b[0] );
        dist[1] =0;
        pq.offer(new int[]{0,1});

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int d =curr[0], u = curr[1];

            for(int[] it : adj.get(u)){
                int v = it[0], w =it[1];
                if(d+w < dist[v]){
                    dist[v] = d + w ;
                    parent[v] = u;
                    pq.offer(new int[]{dist[v] , v});
                }
            }
        }
        if(dist[n] == Integer.MAX_VALUE) return Arrays.asList(-1);

        List<Integer> path = new ArrayList<>();
        int node = n;
        while (parent[node] != node){
            path.add(node);
            node =parent[node];
        }
        path.add(1);
        Collections.reverse(path);

        path.add(0, dist[n]);
        return path;
    }
}
