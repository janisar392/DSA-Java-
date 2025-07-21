package DSA.Graph.BFS_DFS_Topo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class isBipertite {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color,-1);

        for(int i =0 ; i< n ; i++){
            if(color[i] == -1){
                if(!bfs(graph,i,color)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean bfs(int[][] graph , int start, int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        color[start] =0;

        while (!q.isEmpty()){
            int node = q.poll();

            for(int neighbor : graph[node]){
                if(color[neighbor] == -1){
                    color[neighbor] = 1-color[node];
                    q.offer(neighbor);
                } else if (color[neighbor] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }
}
