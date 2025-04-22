package DSA.Array.LeetCode;

public class RemoveDuplicate {
    public static int RemoveDuplicateAndFindUniqueNumber(int[] nums){
        int n =nums.length;
        if(n==0) return 0;
        int i=0;

        for(int j =1 ; j< n ;j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] =nums[j];
            }
        }
        return i+1;
    }
}
