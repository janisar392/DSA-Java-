package LeetCode;

import java.util.Arrays;

public class KokoEatingBanana {

    public int minEatingSpeed(int[] piles, int h){
        int ans =0 ;
        int low  =1;
        int high = Arrays.stream(piles).max().getAsInt();

        while (low <= high){
            int mid = low + (high-low)/2;

            if(minPossible(piles, mid , h)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static boolean minPossible(int[] arr , int banana , int h){
        int num =0 ;

        for(int i =0 ; i < arr.length ; i++){
            if(arr[i] >= banana){
                num += Math.ceil((double) arr[i]/banana);
            }
            else{
                num++;
            }
        }
        return num <= h ;
    }
}
