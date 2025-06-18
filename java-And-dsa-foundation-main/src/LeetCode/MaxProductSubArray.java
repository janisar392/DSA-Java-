package LeetCode;

public class MaxProductSubArray {

    public static  int maxProduct(int[] arr){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        int prefix =1 , suffix =1;

        for(int i =0 ; i< n ; i++){
            if(prefix == 0 ) prefix =1;
            if(suffix == 0 ) suffix =1;

            prefix *= arr[i];
            suffix *= arr[n-i-1];

            ans = Math.max(ans , Math.max(prefix,suffix));
        }
        return ans;
    }
}
