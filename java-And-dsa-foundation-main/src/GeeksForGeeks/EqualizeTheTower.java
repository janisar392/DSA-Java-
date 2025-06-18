package GeeksForGeeks;

public class EqualizeTheTower {
    public long minCost(int[] heights , int[] cost ){
        int n = heights.length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int h : heights){
            low = Math.min(low , h);
            high= Math.max(high , h);
        }

        long ans = Long.MAX_VALUE;

        while (low <= high){
            int mid = low + (high - low )/2;
            long costMid = computeCost(heights , cost , mid);
            long costLeft= computeCost(heights , cost , mid-1);
            long costRight = computeCost(heights, cost , mid+1);

            ans = Math.min(ans , costMid);

            if(costLeft < costMid){
                high = mid -1 ;
            } else if (costRight < costMid) {
                low = mid+1;
            } else {
                break;
            }
        }
        return ans;
    }


    private long computeCost(int[] heights , int[] cost , int target){
        long total = 0 ;
        for(int i =0 ; i < heights.length ; i++){
            total += 1L * Math.abs(heights[i] - target) * cost[i];
        }
        return total;
    }
}
