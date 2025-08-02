package GeeksForGeeks;

public class powerfulInteger {
    public int powerfulInteger(int[][] intervals, int k){
        int maxEnd = 0;
        for(int [] interval : intervals){
            maxEnd = Math.max(maxEnd , interval[1]);
        }
        int [] diff = new int[maxEnd+2];

        for(int[] interval : intervals){
            int start = interval[0];
            int end = interval[1];

            diff[start] += 1;
            if(end+1 < diff.length){
                diff[end+1] -= 1;
            }
        }
        int preSum =0;
        int maxPowerful =-1;
        for(int i=1 ; i< diff.length ;i++){
            preSum += diff[i];
            if(preSum >= k){
                maxPowerful =i;
            }
        }
        return maxPowerful;
    }
}
