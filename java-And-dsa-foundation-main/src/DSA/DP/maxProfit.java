package DSA.DP;

import java.util.Arrays;

public class maxProfit {

    public int maxProfits(int[][] jobs ){
        int n = jobs.length;

        Arrays.sort(jobs, (a,b) -> a[1]-b[1]);

        int[] dp = new int[n];
        dp[0] = jobs[0][2];

        int[] endTimes = new int[n];
        for(int i =0 ; i< n ; i++){
            endTimes[i] = jobs[i][1];
        }

        for(int i =1 ; i< n ; i++){
            int includeProfit = jobs[i][2];

            int last = findLastNonOverlap(endTimes , jobs[i][0]);
            if(last !=-1){
                includeProfit += dp[last];
            }

            dp[i] = Math.max(includeProfit , dp[i-1]);
        }

        return dp[n-1];
    }

    private int findLastNonOverlap(int[] endTimes, int currentStart) {
        int low = 0, high = endTimes.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (endTimes[mid] <= currentStart) {
                result = mid;
                low = mid + 1; // look for later compatible job
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
