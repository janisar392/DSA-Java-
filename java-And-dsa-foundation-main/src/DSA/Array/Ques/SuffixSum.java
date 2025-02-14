package DSA.Array.Ques;

import java.util.Scanner;

public class SuffixSum {
    static void PrintArray(int arr[]){
        for (int i = arr.length-1 ;i >= 0 ; i--){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }
    static int[] makeSuffixSumArray(int[] arr){
        int n = arr.length;
        int[] Suffix = new int[n];
        //Suffix[0] = arr[0];
        int count=0;
        for (int i= n-1 ; i >=0 ; i--){
            if(count>0)
            {
                Suffix[count]=Suffix[count-1]+arr[i];
            }
            else
            {
                Suffix[count]=arr[i];
            }
            count++;
        }
        return Suffix;
    }


    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" Arrays");
        for (int i = 0 ; i < arr.length ;i++ ){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array : ");
        PrintArray(arr);

        int[] pref = makeSuffixSumArray(arr);
        System.out.println("Suffix sum Array");
        PrintArray(pref);


    }
}
