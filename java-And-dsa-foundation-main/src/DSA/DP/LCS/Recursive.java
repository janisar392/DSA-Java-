package DSA.DP.LCS;

public class Recursive {
    public static int LCS(String x , String y , int n , int m){
        if(n==0 || m ==0) return 0;

        if(x.charAt(n-1) == y.charAt(m-1)){
            return 1+ LCS(x,y,n-1,m-1);
        }
        else
            return Math.max(LCS(x,y,n,m-1) , LCS(x,y,n-1,m));
    }
}
