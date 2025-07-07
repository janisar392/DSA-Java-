package DSA.Graph;

import java.util.ArrayList;

public class isCycleDFS {
    public boolean isCycle(int V , ArrayList<ArrayList<Integer>> adj){

        boolean[] visited = new boolean[V];
        for(int i =0 ; i< V ;i++){
            if(!visited[i]){
                if(dfs(i,-1,visited, adj)) return true;
                }
            }
        return false;
    }
    private static boolean dfs(int node,int parent, boolean[] visited,ArrayList<ArrayList<Integer>> adj ){
        visited[node] =true;

        for(int i : adj.get(node)){
            if(!visited[i]){
                if(dfs(i,node,visited,adj)) return true;
            } else if (i != parent) return  true;
        }
        return false;
    }
}
