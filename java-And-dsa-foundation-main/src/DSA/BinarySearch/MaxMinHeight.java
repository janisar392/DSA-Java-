package DSA.BinarySearch;

import java.util.Arrays;

public class MaxMinHeight {

    public static int maxMinHeight(int[] arr , int k , int w){
        int low = Arrays.stream(arr).min().getAsInt();
        int high = low + k;
        int ans =low;
        while(low <= high ){
            int mid = low + (high -low)/2;
            if(isPossible(arr,k,w,mid)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int k, int w, int mid) {
        int n = arr.length;
        int[] water = new int[n+w+1];
        int used =0;
        int currWater =0;

        for(int i=0 ; i< n ; i++){
            currWater += water[i];
            int currHeight = arr[i] + currWater;

            if(currHeight < mid){
                int needed = mid - currHeight;
                used += needed;

                if(used > k) return false;

                currWater += needed;
                water[i+w] -= needed;

            }
        }
        return true;
    }
}
