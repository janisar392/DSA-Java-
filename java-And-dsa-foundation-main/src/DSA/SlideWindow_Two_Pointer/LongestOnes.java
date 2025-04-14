package DSA.SlideWindow_Two_Pointer;

public class LongestOnes {
    public static int longestones(int[] nums , int k){
        int left =0 , right =0 , maxLength =0, zeroes=0;

        while (right < nums.length){
            if(nums[right]==0)  zeroes++;

            if(zeroes > k){
                if(nums[left]==0) zeroes--;
                left++;
            }
            if(zeroes <= k){
                maxLength = Math.max(maxLength,right-left+1);
            }
            right++;
        }

        return maxLength;
    }
}
