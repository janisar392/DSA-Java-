package DSA.Array.LeetCode;

public class moveZeros {
    public static void moveZero(int[] arr){
        int n = arr.length;
        int nonZeroIndex =0;

        for(int i=0; i<n ;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] =temp;

                nonZeroIndex++;
            }
        }
    }
}
