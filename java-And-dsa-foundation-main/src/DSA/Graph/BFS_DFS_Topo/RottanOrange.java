package DSA.Graph.BFS_DFS_Topo;

import java.util.LinkedList;
import java.util.Queue;

public class RottanOrange {
    public int orangesRotting(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        int freshCount =0 ;

        for(int i=0 ; i< m ;i++){
            for(int j=0 ;j< n ;j++){
                if(mat[i][j] == 2){
                    q.add(new int[]{i,j,0});
                    visited[i][j] = true;
                } else if (mat[i][j]==1) {
                    freshCount++;
                }
            }
        }

        int[] dx ={-1,0,0,1};
        int[] dy ={0,-1,1,0};
        int time =0;
        int rottedFresh =0;

        while (!q.isEmpty()){
            int[] curr = q.poll();
            int i = curr[0];
            int j = curr[1];
            int t = curr[2];
            time = Math.max(time,t);

            for(int d =0 ; d< 4; d++){
                int nrow = i + dx[d];
                int ncol = j + dy[d];

                if(nrow >=0 && nrow < m && ncol >= 0 && ncol < n &&
                   mat[nrow][ncol]==1 && !visited[nrow][ncol]){
                    visited[nrow][ncol] = true;
                    q.add(new int[]{nrow, ncol, t+1});
                    rottedFresh++;
                }
            }
        }
        return rottedFresh == freshCount ? time :-1;
    }
}
