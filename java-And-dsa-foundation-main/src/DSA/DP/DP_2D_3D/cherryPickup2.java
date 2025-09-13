package DSA.DP.DP_2D_3D;

public class cherryPickup2 {
    private int n ,m;
    private int[][] grid;
    private int[][][] dp;
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        this.n = n;
        this.m = m;
        this.grid = grid;

        dp = new int[n][m][m];
        for(int i=0; i< n ; i++){
            for(int j1 =0 ; j1 < m ; j1++){
                for(int j2 =0 ; j2 < m ; j2++){
                    dp[i][j1][j2] = -1;
                }
            }
        }
        return helper(0,0,m-1);
    }

    private int helper(int i , int j1 , int j2){
        if(j1 < 0 || j1 >= m || j2 < 0 || j2 >= m) return (int)-1e9;

        // base case
        if(i == n-1){
            if(j1==j2) return grid[i][j1];
            else return grid[i][j1] + grid[i][j2];
        }

        if(dp[i][j1][j2] != -1) return dp[i][j1][j2];

        int curr = (j1==j2) ? grid[i][j1] : grid[i][j1] + grid[i][j2];
        int maxVal =0;

        for(int dj1 = -1 ; dj1 <= 1 ; dj1++){
            for(int dj2 = -1 ; dj2 <=1 ; dj2++){
                int nextVal = helper(i+1 , j1 + dj1 , j2+dj2);
                maxVal = Math.max(maxVal , nextVal + curr);
            }
        }
        return dp[i][j1][j2] = maxVal;
    }
}
