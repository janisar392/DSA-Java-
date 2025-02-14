package DSA.BinarySearch;

public class BinarySearch {

    public static boolean binarySearch(int[] arr ,int target ,int start , int end){

        while (start<=end) {
            int mid = (start + end) / 2;

            if (target == arr[mid])
                return true;
            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target >arr[mid]) {
                start = mid + 1;
            }
        }
        return false;
    }

    public static boolean recursiveBinary(int[] arr ,int target , int start , int end){

        if(start>end)
            return false;

        int mid = (start+end)/2;

        if(target==arr[mid]){
            return true;
        }
        else if(target<arr[mid]){
            return recursiveBinary(arr,target,start,mid-1);
        }
        else {
            return recursiveBinary(arr,target,mid+1,end);
        }

    }

    public static void main(String[] args) {
        int arr[] ={2,3,4,6,7,9,12,23,56};
        int target = 12;

        System.out.println(recursiveBinary(arr,target,0,arr.length-1));
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }
}
