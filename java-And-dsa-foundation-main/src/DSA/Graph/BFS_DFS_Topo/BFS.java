package DSA.Graph.BFS_DFS_Topo;

import java.util.*;

public class BFS {

    public ArrayList<Integer> bfs(int V , ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer>  bfs = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] =true;

        while (!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(Integer i : adj.get(node)){
                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);

        BFS bfsObj = new BFS();
        ArrayList<Integer> result = bfsObj.bfs(V, adj);

        System.out.println("BFS Traversal: " + result);
    }

}
