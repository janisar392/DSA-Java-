package DSA.BinarySearch;

public class RotatedArray {

    public static int Search(int arr[], int target){
        int n = arr.length;
        int low = 0;
        int high = arr.length-1;

        while(low<= high){
            int mid = low+(high-low)/2;
            if(arr[mid]== target) return mid;

            if(arr[mid] <= arr[high]){            //right sorted part
                if(target > arr[mid]     && target <= arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            else{        // left sorted part
                if(target >= arr[low] && target < arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid +1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2,3};
        int target = 5;

        System.out.println(Search(arr,target));
    }
}
