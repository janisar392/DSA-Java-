package DSA.DP.MCM;

public class palPartition {

    public static int palindromePart(String s){
        int n = s.length();

        boolean[][] isPal = new boolean[n][n];

        for(int i =0 ; i< n ;i++) isPal[i][i] = true;

        for(int len =2 ; len <= n ; len++){
            for(int i=0 ; i<=n ; i++){
                int j = i+ len -1;
                if(s.charAt(i) == s.charAt(j)){
                    if(len == 2)
                        isPal[i][j] = true;
                    else
                        isPal[i][j] = isPal[i+1][j-1];
                }
            }
        }
        int [] dp = new int[n];
        for(int i=0 ; i <n ; i++){
            if(isPal[0][i]) dp[i] =0;
            else{
                int min = Integer.MAX_VALUE;
                for(int j=0 ; j< i ;j++){
                    if(isPal[j+1][i])
                        min = Math.min(min , dp[j]+1);
                }
                dp[i] = min;
            }
        }
        return dp[n-1];
    }
}
