package DSA.Graph.SortestPathAlgo;
import java.util.*;

public class PathWithMinEffort {

    public int minimumEffortPath(int[][] heights) {

        int m = heights.length;
        int n = heights[0].length;

        int[][] dist = new int[m][n];
        for(int[] row : dist){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        dist[0][0] =0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - a[0]);
        pq.offer(new int[]{0,0,0});

        int[] dx = {-1,0,0,1};
        int[] dy = {0,-1,1,0};

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int effort = curr[0];
            int row = curr[1];
            int col = curr[2];

            if(row == m-1 && col == n-1) return effort;

            for(int d=0 ; d<4; d++){
                int newRow = row + dx[d];
                int newCol = col + dy[d];

                if(newRow >= 0 && newRow < m  && newCol >= 0 && newCol <n ){
                    int newEffort = Math.max(effort , Math.abs(heights[row][col] - heights[newRow][newCol]));
                    if(newEffort < dist[newRow][newCol]){
                        dist[newRow][newCol] = newEffort;
                        pq.offer(new int[]{newEffort, newRow, newCol});
                    }
                }
            }
        }
        return 0;
    }
}
