package DSA.BinarySearch;

public class RotatedArray {

    public static int Search(int arr[], int target){
        int start =0 ;
        int end =arr.length-1;

        while (start<=end){

            int mid = start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }
            else if(arr[mid]<arr[end]){
                if(target>arr[mid]&&target<=arr[end]){
                    start =mid+1;
                }
                else {
                    end= mid-1;
                }
            }
            else {
                if(target>=arr[start]&&target<arr[mid]){
                    end = mid-1;
                }
                else {
                    start=mid+1;
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
