package DSA.BinarySearch;

public class SearchInDuplicate {

    //duplicate value allowed
    public static int search(int[] arr , int target){

        int start = 0;
        int end = arr.length-1;

        while (start<=end){

            int mid = start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }
            if(arr[start]==arr[mid] &&arr[mid]==arr[end]){
                start++;
                end--;
            }
            else if(arr[mid]<= arr[end]){
                if(target>arr[mid] && target<=arr[end]) {
                    start = mid+1;
                }
                else {
                    end=mid-1;
                }
            }else {
                if(target>=arr[start]&&target<arr[mid]){
                    end =mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={1,1,1,2,3,3,4,5,1,1};
        int target = 4;

        System.out.println(search(arr,target));
    }

}
