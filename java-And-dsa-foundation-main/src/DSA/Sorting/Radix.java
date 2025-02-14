package DSA.Sorting;

public class Radix {

    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            if (arr[i]> mx){
                mx = arr[i] ;
            }
        }
        return mx ;
    }

    static void count_sort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for(int i = 0; i <arr.length ; i++){  // make frequncy array
            count[(arr[i]/place)%10]++;
        }
        // Make prefix sum array of count array
        for (int i = 1 ; i<count.length ; i++){
            count[i] += count[i-1];
        }

        // Find the index of each element in the original array and put it output array
        for (int i = n-1 ; i>= 0 ; i--){
            int idx = count[(arr[i]/place)%10] -1 ;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        // copy all elements of output to arr
        for(int i = 0 ; i < n ; i++){
            arr[i] = output[i];
        }
    }

    static void radix_sort(int[] arr){
        int max = findMax(arr); // get maximum element
        // apply counting sort to sort elements based on place value

        for(int place = 1 ; max/place > 0 ; place *= 10){
            count_sort(arr ,place);
        }
    }

    static void display(int[] arr){
        for (int ans : arr){
            System.out.print(ans+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5,12,156,87,15,1588,214,9};
        System.out.println("Array before sorting : ");
        display(arr);

        System.out.println("Array after sorting :");
        radix_sort(arr);
        display(arr);

    }
}
