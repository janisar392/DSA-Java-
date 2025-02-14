package DSA.Sorting;

public class count_sort {

    static void display(int[] arr){
        for (int ans : arr){
            System.out.print(ans+" ");
        }
        System.out.println();
    }



    static void count_sort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findmax(arr); // find the largest number
        int[] count = new int[max+1];
        for(int i = 0; i <arr.length ; i++){  // make frequncy array
            count[arr[i]]++;
        }
        // Make prefix sum array of count array
        for (int i = 1 ; i<count.length ; i++){
            count[i] += count[i-1];
        }

        // Find the index of each element in the original array and put it output array
        for (int i = n-1 ; i>= 0 ; i--){
            int idx = count[arr[i]] -1 ;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        // copy all elements of output to arr
        for(int i = 0 ; i < n ; i++){
            arr[i] = output[i];
        }
    }

    static int findmax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx ;
    }

    static void basicCountSort(int[] arr){
        // find the largest number
        int max = findmax(arr);

        //  frequency array

        int[] count = new int[max+1];
        for(int i = 0 ; i < arr.length ; i++){
            count[arr[i]]++;
        }
        int k = 0 ;
        for(int i = 0 ; i< count.length;i++){
            for(int j = 0 ; j < count[i] ; j++){
                arr[k++] = i ;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {8,4,3,78,15,49,46,12};

        System.out.println("Array before sorting :");
        display(arr);

        System.out.println("Array After Sorting : ");
     //   basicCountSort(arr);
        count_sort(arr);
        display(arr);
    }
}
