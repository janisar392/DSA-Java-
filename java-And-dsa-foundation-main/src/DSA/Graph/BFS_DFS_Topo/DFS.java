package DSA.Graph.BFS_DFS_Topo;

import java.util.ArrayList;

public class DFS {
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {

        int V = adj.size();
        boolean[] visited = new boolean[V+1];

        visited[0] = true;
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(0,visited,adj,ans);
        return ans;
    }

    public static void dfs(int node, boolean visited[] , ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> list){

        visited[node] = true;
        list.add(node);

        for(Integer i : adj.get(node)){
            if(! visited[i]){
                dfs(i, visited, adj,list);
            }
        }
    }
}
