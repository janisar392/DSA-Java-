package DSA.DP.MCM;

public class BooleanParenthesization {
    static int[][][] dp;
    static int countWays(String s) {

        int n = s.length();
        dp = new int[n][n][2];

        for(int i=0 ; i< n ; i++){
            for(int j=0 ; j< n ; j++){
                dp[i][j][0] = -1;
                dp[i][j][1] = -1;
            }
        }
        return solve(s, 0, n-1, 1);
    }

    private static int solve(String s, int i , int j , int isTrue){
        if( i > j) return 0;

        if(i == j ){
            if(isTrue == 1) return s.charAt(i) == 'T' ? 1:0;
            else return s.charAt(i) == 'F' ? 1 : 0;
        }

        if(dp[i][j][isTrue] != -1 ) return dp[i][j][isTrue];

        int ways =0;

        for(int k = i+1 ; k <= j-1 ; k+= 2){
            char op = s.charAt(k);

            int LT = solve(s,i,k-1,1);
            int LF = solve(s,i,k-1,0);
            int RT = solve(s,k+1,j,1);
            int RF = solve(s,k+1,j,0);

            if(op =='&'){
                if(isTrue ==1)
                    ways += LT * RT;
                else
                    ways += LT * RF + LF * RT + LF * RF ;
            }
            else if(op =='|'){
                if(isTrue == 1)
                    ways += LT * RF + LF * RT + LT * RT ;
                else
                    ways += LF * RF;
            }
            else if(op == '^'){
                if(isTrue == 1)
                    ways += LT * RF + LF * RT;
                else
                    ways += LF * RF + LT * RT;
            }
        }
        return dp[i][j][isTrue] = ways;
    }
}
