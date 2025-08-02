package DSA.SlideWindow_Two_Pointer;

public class sumOfSubArray {

    public int subArraySum(int[] arr){
        int n = arr.length;
        int totalSum = 0;
        for(int i =0 ; i< n ; i++){
            totalSum += arr[i] * (i+1) *(n-i);
        }
        return totalSum;
    }
}
