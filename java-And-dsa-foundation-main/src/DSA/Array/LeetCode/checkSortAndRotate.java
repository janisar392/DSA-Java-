package DSA.Array.LeetCode;

public class checkSortAndRotate {
    public static boolean check(int[] arr){
        int n = arr.length;
        int count =0;
        for(int i =0 ; i< n ; i++){
            if(arr[i] > arr[(i+1)%n]){
                count++;
            }
        }
        return count <= 1;
    }
}
