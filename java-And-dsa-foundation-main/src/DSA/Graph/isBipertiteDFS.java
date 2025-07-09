package DSA.Graph;

import java.util.Arrays;


public class isBipertiteDFS {

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color,-1);

        for(int i =0 ; i < n ;i++){
            if(color[i] == -1 ){
                if(!dfs(graph,i,0,color)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean dfs(int[][] graph , int node , int c , int[] color){
        color[node] = c;
        for(int i : graph[node]){
            if(color[i] == -1){
                if(!dfs(graph,i,1-c ,color)){
                    return false;
                }
            } else if (color[i]==c) {
                return false;
            }
        }
        return true;
    }
}
