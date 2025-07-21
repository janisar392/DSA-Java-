package DSA.Graph.BFS_DFS_Topo;

import java.util.ArrayList;
import java.util.List;

public class isCycleDirected {
    public static boolean isCycle(int V , int[][] edges){

        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0 ; i< V ; i++) adj.add(new ArrayList<>());
        for(int[] edge : edges){
            int u = edge[0], v = edge[1];
            adj.get(u).add(v);
        }
        int[] vis = new int[V];
        int[] pathVis = new int[V];

        for(int i =0 ; i< V ;i++){
            if(vis[i] == 0){
                if (dfsCheck(i , adj, vis, pathVis)) return true;
            }
        }
        return false;
    }

    private static boolean dfsCheck(int node , List<List<Integer>> adj , int[] vis , int[] pathVis){
        vis[node] = 1;
        pathVis[node] =1;

        for(int i : adj.get(node)){
            if(vis[i] == 0){
                if(dfsCheck(i, adj,vis,pathVis)) return true;
            } else if (pathVis[i] ==1) {
                return true;
            }
        }

        pathVis[node] =0;
        return false;
    }
}
