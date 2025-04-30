package DSA.Array.LeetCode;

public class RotateArray {
    public static void rotate(int arr[] , int k){
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

    }

    private static void reverse(int[] arr , int left , int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
