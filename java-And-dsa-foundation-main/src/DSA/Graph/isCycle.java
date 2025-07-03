package DSA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class isCycle {
    public boolean isCycle(int V , int[][] edges){

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0 ; i< V ; i++) adj.add(new ArrayList<>());

        for(int[] edge : edges){
            int u = edge[0], v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[V];
        for(int i=0; i<V; i++){
            if(!visited[i]){
                if(bfsCheckCycle(i,visited,adj)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean bfsCheckCycle(int st , boolean[] visited ,List<List<Integer>> adj){
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{st, -1});
        visited[st] =true;

        while (!queue.isEmpty()){
            int[] curr = queue.poll();
            int node = curr[0];
            int parent = curr[1];

            for(int i : adj.get(node)){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(new int[]{i,node});
                } else if (i != parent) {
                    return true;
                }
            }
        }
        return false;
    }
}
