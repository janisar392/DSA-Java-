package DSA.SlideWindow_Two_Pointer;

public class countNiceSubArray {
    public static int helper(int[] arr , int goal){
        int left =0 , right =0 , sum =0 , count =0;

        while (right < arr.length){
            if(goal <0) return 0;

            sum += arr[right]%2;

            if(sum > goal){
                if(arr[left]%2 == 1){
                    sum -= arr[left];
                }
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
