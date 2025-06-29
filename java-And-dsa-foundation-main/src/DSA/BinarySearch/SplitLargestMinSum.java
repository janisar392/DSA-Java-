package DSA.BinarySearch;

public class SplitLargestMinSum {
    public static boolean canSplit(int[] nums , int k ,int maxSum){
        int count =1;
        int currSum =0;

        for(int num: nums){
            if(currSum+num > maxSum){
                count++;
                currSum=num;
                if(count > k){
                    return false;
                }
            }else {
                currSum += num;
            }
        }
        return true;
    }

    public static int splitArray(int[] nums, int k){

        int maxVal = Integer.MIN_VALUE;
        int sum = 0;
        for(int num:nums){

            maxVal=Math.max(maxVal,num);
            sum += num;
        }
        int low =maxVal;  // lower bound
        int high = sum;   // upper bound

        while(low<high){
            int mid = low+(high-low)/2;

            if(canSplit(nums,k,mid)){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}
