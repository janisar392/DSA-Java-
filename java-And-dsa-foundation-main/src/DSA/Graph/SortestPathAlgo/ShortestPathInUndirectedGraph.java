package DSA.Graph.SortestPathAlgo;
import java.util.*;

public class ShortestPathInUndirectedGraph {

    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
         int n = adj.size();
        int[] dist = new int[n];
        Arrays.fill(dist , -1);

        Queue<Integer> q = new LinkedList<>();
        dist[src] =0;
        q.add(src);

        while(!q.isEmpty()){
            int node = q.poll();

            for(int it : adj.get(node)){
                if(dist[it] == -1){
                    dist[it] = dist[node]+1;
                    q.add(it);
                }
            }
        }
        return dist;
    }
}
