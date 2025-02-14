package GreaksForGreaks;

import java.util.Scanner;

public class DuplicateNumber {

    static void cheak_duplicate(int arr[] ){
       int n = arr.length;
        for ( int i = 0 ; i<n ;i++){
            for ( int j = i+1; j< n ; j++){
                if (arr[i]==arr[j]){
                    System.out.println(i);

                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" Elements :");
        int[] arr = new int[n];

        for (int i = 0 ;i < n ; i++){
            arr[i] = sc.nextInt();
   //         System.out.print(arr[i]+" ");
        }
        cheak_duplicate(arr);

    }
}
