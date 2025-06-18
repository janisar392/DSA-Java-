package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimizeTheHeights {

    int getMinDiff(int[] arr , int k){
        int n = arr.length;
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        int smallest = arr[0] + k ;
        int largest = arr[n-1] - k ;

        int max , min ;

        for(int i =0 ; i < n-1 ; i++ ){
            int small = arr[i+1] -k;
            int large = arr[i] + k ;

            if(small < 0 ) continue;
            min = Math.min(smallest ,small);
            max = Math.max(largest ,large);

            ans = Math.min(ans , max - min);
        }
        return ans ;
    }
}
