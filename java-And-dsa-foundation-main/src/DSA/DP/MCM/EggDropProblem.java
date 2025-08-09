package DSA.DP.MCM;
import java.util.*;

public class EggDropProblem {
    static int[][] dp ;
    public int superEggDrop(int k, int n) {
        dp = new int[k+1][n+1];
        for(int[] rows : dp){
            Arrays.fill(rows , -1);
        }
        return solve(k,n);
    }

    private static int solve(int e , int f){
        if(f==0 || f==1) return f;
        if(e==1) return f;
        if(dp[e][f] != -1) return dp[e][f];

        int low =1 , high = f , ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high -low)/2;
            int breakCase = solve(e-1 , mid-1);
            int surviveCase = solve(e , f - mid);

            int worst = 1 + Math.max(breakCase , surviveCase);

            if(breakCase > surviveCase){
                high = mid -1;
                ans = Math.min(ans , worst);
            }
            else{
                low = mid+1;
                ans = Math.min(ans , worst);
            }
        }
        return dp[e][f] = ans;
    }
}
