package DSA.Array;

import java.util.Scanner;

public class Input_array {

    static void printArray(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array ");
        int n = sc.nextInt();

        System.out.println("Enter "+n+" Elements :");
        int[] arr = new int[n];

        for (int i=0 ; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of Array are :-");
        printArray(arr);

        int arr2[] = arr;
        System.out.println("Copy of Elements of Array :- ");
        printArray(arr2);
    }
}
