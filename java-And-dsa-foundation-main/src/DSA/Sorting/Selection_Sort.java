package DSA.Sorting;

public class Selection_Sort {
    
    static void selection_sort(int[] arr){
        int n = arr.length;
        for (int i = 0 ;i < n-1 ; i++ ){  // i represent current index
            // Find the minimum element in unsorted part of array
            int min_index = i;

            for (int j = i+1 ; j< n ;j++){
                if (arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            //
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp ;
            
        }
    }
    public static void main(String[] args) {
        int[] arr = {2 , 4, 7, 5 ,9 ,0 , 23};
        selection_sort(arr);
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
