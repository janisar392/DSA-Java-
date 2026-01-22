package DSA.DP.DP_2D_3D;

import java.util.Scanner;

public class uniquePath2 {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] grid = new int[N][M];
        for(int i =0 ; i< N ; i++){
            for(int j=0 ; j<M ; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        int ans = totalWays(N, M , grid);
        System.out.println(ans);
    }

    private static int MOD = 10000_00007;
    public static int totalWays(int N, int M, int grid[][]) {
        // Code here
        int[][] dp = new int[N][M];

        dp[0][0] = (grid[0][0] == 0) ? 1 : 0;

        for(int i =1 ; i< N ; i++){
            dp[i][0] = grid[i][0] == 0 ? dp[i-1][0] : 0;
        }

        for(int j =1 ; j< M ; j++){
            dp[0][j] = grid[0][j] == 0 ? dp[0][j-1] : 0;
        }

        for(int i = 1 ; i< N ; i++){
            for(int j =1 ; j< M ; j++){
                if(grid[i][j] == 0){
                    dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % MOD;
                }
                else{
                    dp[i][j] =0;
                }
            }
        }
        return dp[N-1][M-1];
    }
}
