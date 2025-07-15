package DSA.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopoSort {
    public static ArrayList<Integer> topologySort(int[][] edges, int V){

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0 ; i< V ;i++) adj.add(new ArrayList<>());
        for(int[] edge : edges){
            int u = edge[0] , int v = edge[1];
            adj.get(u).add(v);
        }
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for(int i =0 ; i< V ; i++){
            if(!visited[i]){
                dfs(i , visited, st, adj);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
    }

    private static void dfs(int node, boolean[] visited, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj) {

        visited[node] = true;
        for(int i : adj.get(node)){
            if(!visited[i]){
                dfs(i,visited,st,adj);
            }
        }
        st.push(node);
    }

}
