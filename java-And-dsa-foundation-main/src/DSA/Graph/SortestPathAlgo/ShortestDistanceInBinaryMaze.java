package DSA.Graph.SortestPathAlgo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestDistanceInBinaryMaze {

    int shortestPath(int[][] grid, int[] source, int[] destination){
        int n = grid.length;
        int m = grid[0].length;

        if(grid[source[0]][source[1]] ==0 || grid[destination[0]][destination[1]]==0 )
            return -1;
        if(Arrays.equals(source,destination))
            return 0;

        int[][] dist = new int[n][m];
        for(int[] row : dist){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        dist[source[0]][source[1]] =0;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{source[0], source[1],0});

        int[] dx = {-1,0,0,1};
        int[] dy = {0,-1,1,0};

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0], col= curr[1], d =curr[2];

            for(int dir =0 ; dir < 4 ; dir++){
                int newRow= row + dx[dir];
                int newCol = col + dy[dir];

               if(newRow >= 0 && newRow <n && newCol >= 0 && newCol <m &&
                  grid[newRow][newCol] == 1 && d+1 < dist[newRow][newCol]){
                   dist[newRow][newCol] = d+1;

                   if(newRow == destination[0] && newCol==destination[1])
                       return dist[newRow][newCol];

                   q.offer(new int[]{newRow, newCol ,d+1});
               }
            }
        }
        return -1;
    }
}
