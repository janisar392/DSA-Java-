package DSA.Sorting;

public class bubble_Sort {

    static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void bubblesort(int arr[]){
        int n = arr.length;

        for(int i = 0 ; i < n-1 ; i++){
            for(int j= 0 ; j<n-i-1; j++){


                if(arr[j]> arr[j+1]){

                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,9,2,7,11,45,8,49};

        System.out.println("Array before sorting : ");
        printArray(arr);

        bubblesort(arr);

        System.out.println("Array After sorting : ");
        printArray(arr);
    }
}
