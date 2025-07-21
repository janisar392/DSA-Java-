package DSA.Graph.BFS_DFS_Topo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountDistinctIsland {

    int countDistinctIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        Set<String> set = new HashSet<>();
        boolean[][] visited = new boolean[n][m];

        for(int i =0 ; i < n ;i++){
            for(int j =0 ; j< m ;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    List<String> shape = new ArrayList<>();
                    dfs(grid,visited,i,j,i,j,shape);
                    set.add(String.join(",", shape));
                }
            }
        }
        return set.size();
    }

    private void dfs(int[][] grid , boolean[][] visited , int i, int j, int bRow , int bCol , List<String> shape){
        int n = grid.length;
        int m = grid[0].length;

        if (i < 0 || j < 0 || i >= n || j >= m || visited[i][j] || grid[i][j]==0) return;

        visited[i][j] = true;
        shape.add((i-bRow)+"_"+(j-bCol));

        dfs(grid, visited,i-1,j,bRow,bCol,shape);
        dfs(grid, visited,i,j-1,bRow,bCol,shape);
        dfs(grid, visited,i,j+1,bRow,bCol,shape);
        dfs(grid, visited,i+1,j,bRow,bCol,shape);
    }
}
