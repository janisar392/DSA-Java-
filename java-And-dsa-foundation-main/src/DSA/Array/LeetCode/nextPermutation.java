package DSA.Array.LeetCode;

public class nextPermutation {
    public static void NextPermutation(int[] arr){
        int n = arr.length;
        int i =n-2;

        while(i>=0 && arr[i] >= arr[i+1]){
            i--;
        }
        if(i >=0 ){
            int j = n-1;
            while(arr[j]<= arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,n-1);
    }
    public static void swap(int[] arr , int a , int b){
        int temp = arr[a];
           arr[a] = arr[b];
           arr[b] = temp;
    }

    public static void reverse(int[] arr ,int left, int right){
        while (left < right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }
}
