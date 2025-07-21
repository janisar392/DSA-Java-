package DSA.Graph.SortestPathAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class SortestPath {

    public int[] shortestPath(int V, int E, int[][] edges){
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i =0 ; i< V ; i++){
            adj.add(new ArrayList<>());
        }
        for(int i =0 ; i < E ; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            adj.get(u).add(new int[]{v,w});
        }
        boolean[] vis = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for(int i =0 ; i< V ; i++){
            if(!vis[i]){
                topoSort(i, adj, vis, st);
            }
        }

        int[] dist = new int[V];
        Arrays.fill(dist , Integer.MAX_VALUE);
        dist[0] = 0;

        while(!st.isEmpty()){
            int node = st.pop();
            if(dist[node] != Integer.MAX_VALUE){
                for(int[] edge : adj.get(node)){
                    int v = edge[0];
                    int w = edge[1];
                    if(dist[node] + w < dist[v]){
                        dist[v] = dist[node] +w;
                    }
                }
            }
        }
        for(int i =0 ; i < V ;i++){
            if(dist[i] == Integer.MAX_VALUE){
                dist[i] =-1;
            }
        }
        return dist;
    }

    private void topoSort(int node , ArrayList<ArrayList<int[]>> adj , boolean[] vis , Stack<Integer> st){
        vis[node] = true;
        for(int[] edge : adj.get(node)){
            int v = edge[0];
            if(!vis[v]){
                topoSort(v,adj,vis,st);
            }
        }
        st.push(node);
    }

}
