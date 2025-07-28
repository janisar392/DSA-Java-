package DSA.Graph.MST;

import java.util.*;

class DisJointSet {
    private int[] parent;
    private int[] rank;
    private int[] size;

    public DisJointSet(int n ){
        parent = new int[n];
        rank = new int[n];
        size = new int[n];

        for(int i=0 ; i< n ; i++){
            parent[i] =i;
            rank[i] =0;
            size[i] =1;
        }
    }
    // path compression
    public int find(int u){
        if(parent[u] != u)
            parent[u] = find(parent[u]);
        return parent[u];
    }

    // union by rank
    public void union(int u ,int v){
        int pu = find(u);
        int pv = find(v);
        if(pu == pv) return;
        if(rank[pu] < rank[pv]) parent[pu] = pv;
        else if(rank[pu] > rank[pv]) parent[pv]= pu;
        else{
            parent[pv] = pu;
            rank[pu]++;
        }
    }
    // union by size
    public void unionBySize(int u, int v){
        int pu =find(u);
        int pv =find(v);
        if(pu == pv) return;

        if(size[pu] < size[pv]){
            parent[pu] = pv;
            size[pv] += size[pu];
        }else{
            parent[pv] = pu;
            size[pu] += size[pv];
        }
    }
     // size
    public int getSize(int x) {
        return size[find(x)];
    }
    // Check if two nodes are connected
    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }

}

public class MakingALargeIsland {
   public int makingLargeIsland(int[][] grid){
       int n = grid.length;
       DisJointSet dsu = new DisJointSet(n*n);

       int[] dx = {-1, 1, 0, 0};
       int[] dy = {0, 0, -1, 1};

       for(int i=0 ; i<n ;i++){
           for(int j =0 ; j< n ;j++){
               if(grid[i][j] == 1){
                   int currId = i * n + j ;
                   for(int d=0 ; d < 4 ; d++){
                       int ni  = i + dx[d];
                       int nj = j + dy[d];

                       if(ni >= 0 && nj >= 0 && ni< n && nj < n && grid[ni][nj] == 1){
                           int nearId = ni* n + nj;
                           dsu.unionBySize(currId, nearId);
                       }
                   }
               }
           }
       }
       int maxGroup =0;

       for(int i=0 ; i< n ; i++){
           for(int j =0 ; j < n ; j++){
               if(grid[i][j] ==0){
                   Set<Integer> seen = new HashSet<>();
                   int total = 1;
                   for(int d=0 ; d < 4 ; d++){
                       int ni = i + dx[d];
                       int nj = j + dy[d];
                       if(ni >=0 && ni < n && nj >= 0 && nj < n && grid[ni][nj] ==1){
                           int parentId = dsu.find(ni * n + nj);
                           if(!seen.contains(parentId)){
                               seen.add(parentId);
                               total += dsu.getSize(parentId);
                           }
                       }
                   }

                   maxGroup = Math.max(maxGroup, total);
               }
           }
       }
       for(int i=0 ; i< n*n ; i++){
           maxGroup = Math.max(maxGroup , dsu.getSize(i));
       }
       return maxGroup;
   }
}
