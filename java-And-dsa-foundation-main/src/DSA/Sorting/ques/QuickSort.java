package DSA.Sorting.ques;

public class QuickSort {
    public static void quickSort(int[] arr , int left , int right){
        if(left < right){
            int pIdx = partition(arr, left,right);
            quickSort(arr,left,pIdx-1);
            quickSort(arr,pIdx+1,right);
        }
    }

    public static int partition(int[] arr , int left , int right){
        int pivot = arr[left];
        int i = left;
        int j = right;
        while (i<j){
            while (arr[i] <= pivot && i <= right-1){
                i++;
            }
            while (arr[j] > pivot && j >= left+1){
                j--;
            }
        }
        if(i < j) swap(arr[left],arr[j]);
        return j;
    }
    public static void swap(int a ,int b){
        int temp = a;
        a =b;
        b =temp;
    }
}
