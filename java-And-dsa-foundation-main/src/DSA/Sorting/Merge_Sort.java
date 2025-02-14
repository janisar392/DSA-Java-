package DSA.Sorting;

import javax.swing.*;

public class Merge_Sort {

    static void printArray(int[] arr){
        for (int ans : arr ){
            System.out.print(ans+" ");
        }
    }

    static void merge(int[] arr , int l , int mid , int r){
        int n1 = mid-l+1;
        int n2 = r-mid;


        // creating left and right array

        int[] left = new int[n1];
        int[] right = new int[n2];


        // filing the value in new created array
        int i , j ,k ;

        for( i = 0 ; i < n1 ; i++) left[i] = arr[l+i];
        for( j = 0 ; j < n2 ; j++) right[j] = arr[mid+1+j] ;

        i = 0 ;
        j = 0 ;
        k = l ;

        // comapring and merging and filling and updating

        while(i <n1 && j < n2){
            if (left[i] < right[j])
                arr[k++] = left[i++];

            else
                arr[k++] = right[j++];
        }
        // if i and j index are out of bounds so some additional conditions :

        while(i<n1)
            arr[k++] = left[i++];

        while(j< n2)
            arr[k++] = right[j++];
    }

    static void merge_sort(int[] arr ,int l , int r){
        if( l>= r ) return;

        int mid = (l+r)/2 ;
        merge_sort(arr , l ,mid);
        merge_sort(arr, mid+1 ,r);
        merge(arr , l , mid ,r);
    }

    public static void main(String[] args) {
        int[] arr = {8,4,3,78,15,49,46,12};

        System.out.println("Array before sorting :");
        printArray(arr);

        System.out.println("Array After sorting :");
        int n = arr.length;
        merge_sort(arr ,0,n-1);
        printArray(arr);

    }
}
