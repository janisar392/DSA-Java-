package DSA.BinarySearch;

public class FirstOccurrence {

    public static int firstOccurrence(int arr[], int target , int start , int end){

        int fo = -1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(arr[mid]==target){
                fo= mid;
                end = mid-1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return fo;
    }

    public static void main(String[] args) {

        int arr[]={2,3,5,4,3,5,32,4,5,3,2};
        int target = 3;

        System.out.println(firstOccurrence(arr,target,0,arr.length-1));
    }

}
