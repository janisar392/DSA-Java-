package DSA.Sorting.ques;

public class mergeSort {
    public static void MergeSort(int[] arr , int left , int right){
        int n = arr.length;
        if(left < right){
            int mid = left +(right-left)/2;
            MergeSort(arr, left, mid);
            MergeSort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }

    private static void merge(int[] arr , int left, int mid ,int right){
        int n1 = mid-left+1;
        int n2 = right-mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0 ; i<n1; i++){   // copy data in temp array
            L[i] = arr[left+i];
        }
        for(int j=0; j<n2 ; j++){
            R[j] = arr[mid+j+1];
        }
        // merge array into original
        int i =0 , j=0 , k =left;

        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
            }
        }

        while(i < n1){
            arr[k++] = L[i++];
        }

        while(j < n2){
            arr[k++] = L[j++];
        }

    }
}
