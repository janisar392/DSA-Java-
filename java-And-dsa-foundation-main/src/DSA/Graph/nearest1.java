package DSA.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class nearest1 {
    public static int[][] nearest(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int[][] dist = new int[m][n];
        boolean[][] visited = new boolean[m][n];

        for(int i=0 ; i< m ; i++){
            for(int j =0 ; j<n ; j++){
                if(grid[i][j]==1){
                    queue.add(new int[]{i,j,0});
                    visited[i][j] = true;
                }
            }
        }

        int dx[] = {-1,0,0,1};
        int[] dy = {0,-1,1,0};

        while (!queue.isEmpty()){
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];
            int d = curr[2];

            dist[row][col] = d;

            for(int k =0 ; k<4 ;k++){
                int newRow = row+ dx[k];
                int newCol = col+ dy[k];

                if(newRow >=0 && newRow <m  && newCol >= 0 && newCol < n && !visited[newRow][newCol]){
                    queue.offer(new int[]{newRow,newCol,d+1});
                    visited[newRow][newCol] = true;
                }
            }
        }
        return dist;
    }
}
