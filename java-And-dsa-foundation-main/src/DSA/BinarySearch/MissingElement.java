package DSA.BinarySearch;

public class MissingElement {
    public int kthMissing(int[] arr, int k) {
        int low =0 ;
        int high = arr.length;

        while(low <= high){
            int mid = low + (high -low)/2;

            int missing = arr[mid] -(mid+1);
            if(missing <= k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return k+ high+1;
    }
}
