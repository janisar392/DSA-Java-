package DSA.SlideWindow_Two_Pointer;

public class countNiceSubArray {
    private static int helper(int[] nums, int goal) { // calculate subArray less than equal to goal
        if(goal < 0 ) return 0;
        int left = 0 , right =0 , sum =0 ,count =0;

        while(right < nums.length){
            sum += nums[right]%2;

            while(sum > goal){
                if(nums[left] %2 ==1){
                    sum = sum -1;
                } // else subtract 0;
                left++;
            }

            count += (right-left+1);
            right++;
        }
        return count;
    }
    public static int countNumOfNiceSubArray(int[] nums , int k){
        return (helper(nums, k) - helper(nums, k-1));
    }
}
