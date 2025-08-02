package DSA.Graph.Other;
import java.util.*;

public class StronglyConnectedComponent {
    public int kosaraju(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();

        // step 1 : sort
        boolean[] vis = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i< V ; i++){
            if(!vis[i]){
                dfs(i,vis, adj, st);
            }
        }
        // step 2 : reverse
        ArrayList<ArrayList<Integer>> adjT = new ArrayList<>();
        for(int i=0 ; i< V ; i++) adjT.add(new ArrayList<>());
        for(int i=0 ; i<V ; i++){
            vis[i] = false;
            for(int it : adj.get(i)){
                adjT.get(it).add(i);
            }
        }
        // call dfs and count
        int scc =0 ;
        while (!st.isEmpty()){
            int node = st.pop();
            if(!vis[node]){
                scc++;
                dfs2(node,vis,adjT);
            }
        }
        return scc;
    }

    private void dfs(int node ,boolean[] visited , ArrayList<ArrayList<Integer>> adj ,Stack<Integer> st){
        visited[node] = true;
        for(int it : adj.get(node)){
            if(!visited[it]){
                dfs(it, visited, adj, st);
            }
        }
        st.push(node);
    }
    private void dfs2(int node ,boolean[] visited , ArrayList<ArrayList<Integer>> adj ){
        visited[node] = true;
        for(int it : adj.get(node)){
            if(!visited[it]){
                dfs2(it, visited, adj);
            }
        }
    }
}
