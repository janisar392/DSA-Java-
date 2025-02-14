package DSA.Sorting;

public class insertion_sort_copy {

    static void printArray(int[] arr){
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void insertion_sort(int[] arr){
        for(int i =1 ; i < arr.length ; i++){
            int j = i ;

            while (j>0 && arr[j]<arr[j-1]){

                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,4,3,78,15,49,46,12};

        System.out.println("Array before sorting : ");
        printArray(arr);

        insertion_sort(arr);
        System.out.println("Array after sorting : ");
    //    printArray(arr);

        for(int ans : arr){
            System.out.print(ans+" ");
        }
    }
}
