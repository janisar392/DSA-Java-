package DSA.Graph;

public class CountIslands {
    public int countIslands(char[][] grid) {
       int n = grid.length;
       int m = grid.length;

       boolean[][] visited = new boolean[n][m];
       int count =0;

       for(int i=0 ; i< n ;i++){
           for(int j =0 ; j< m ; j++){
               if(grid[i][j] =='L' && !visited[i][j]){
                   count++;
                   dfs(i,j,grid,visited);
               }
           }
       }
       return count;
    }

    public void dfs(int row , int col , char[][] grid , boolean[][] visited){
        visited[row][col] = true;

        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};

        for(int d =0 ; d<8 ;d++){
            int newRow = row + dx[d];
            int newCol = col + dy[d];

            if(isValid(newRow,newCol, grid, visited)){
                dfs(newRow,newCol,grid,visited);
            }
        }
    }

    public boolean isValid(int row , int col , char[][] grid , boolean[][] visited){
        return row >= 0 && row < grid.length &&
                col >=0 && col < grid[0].length &&
                grid[row][col] == 'L' && !visited[row][col];
    }
}
