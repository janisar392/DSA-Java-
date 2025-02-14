package DSA.Sorting;

public class quick_sort {


    static void display(int[] arr){
        for(int ans : arr){
            System.out.print(ans +" ");
        }
    }

    static void swap(int[] arr , int x ,int y){
        int temp = arr[x] ;
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr , int st , int end){
        int pivot = arr[st];

        int cnt = 0 ;
        for(int i = st+1 ; i <= end ; i++){
            if (arr[i] <= pivot) cnt++ ;
        }
        int pivotIdx = st + cnt;
        swap(arr , st ,pivotIdx );

        int i = st , j = end ;
        // element lesser or equal left , greater elements right side of pivot

        while(i < pivotIdx && j > pivotIdx){
            while (arr[i] <= pivot) i++ ;
            while (arr[j] > pivot)  j-- ;
            if (i < pivotIdx && j > pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx ;

    }

    static void quickSort(int[] arr ,int st , int end ){

        if (st >= end) return;

        int pi = partition(arr ,st ,end);

        quickSort(arr,st,pi-1);
        quickSort(arr , pi+1 ,end);


    }

    public static void main(String[] args) {
        int[] arr = {8,4,3,78,15,49,46,12};

        System.out.println("Array before Sorting  :");
        display(arr);

        System.out.println();

        quickSort(arr ,0,arr.length-1);
        System.out.println("Array after sorting : ");
        display(arr);
    }
}
