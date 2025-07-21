package DSA.Graph.BFS_DFS_Topo;

public class NoOfEnclave {
    int numberOfEnclaves(int[][] grid) {
       int m = grid.length;
       int n =grid[0].length;

       for(int i =0 ; i<m ;i++){
           if(grid[i][0] ==1 ) dfs(grid,i,0,m,n);
           if(grid[i][n-1] ==1) dfs(grid,i,n-1 , m,n);
       }
       for(int j =0 ; j< n ;j++){
           if(grid[0][j] ==1) dfs(grid,0,j,m,n);
           if(grid[m-1][j] ==1) dfs(grid,m-1,j, m,n);
       }
       int count =0 ;
       for(int i=0; i<m;i++){
           for(int j =0 ; j< n ;j++){
               if(grid[i][j]==1){
                   count++;
               }
           }
       }
       return count;
    }
    private static void dfs(int[][] grid , int i , int j , int m , int n){
        if(i <0 || i >=m  || j< 0 || j >= n || grid[i][j] !=1) return;
        grid[i][j]=0;
        dfs(grid,i-1,j,m,n);
        dfs(grid,i,j-1,m,n);
        dfs(grid,i,j+1,m,n);
        dfs(grid,i+1,j,m,n);
    }
}
