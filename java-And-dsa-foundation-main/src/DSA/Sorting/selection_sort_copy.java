package DSA.Sorting;

public class selection_sort_copy {

    static void printArray(int[] arr){
        for(int i = 0 ; i <arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    static void selection_sort(int[] arr){
        for(int i = 0 ; i < arr.length-1 ; i++){
            int min_index = i ;
            for (int j = i+1 ; j < arr.length ; j++){
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,8,1,9,7,45,78,99,12,15};

        System.out.println("Array Before Sorting : ");
        printArray(arr);

        selection_sort(arr);
        System.out.println("Array after selection sort : ");
        printArray(arr);
    }

}
