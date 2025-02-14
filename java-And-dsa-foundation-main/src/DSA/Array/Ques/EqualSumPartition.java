package DSA.Array.Ques;

import java.util.Scanner;

public class EqualSumPartition {


    static int findArraySum(int[] arr){
        int totalSum = 0 ;
        for (int i = 0 ; i < arr.length ; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalsumPartition(int[] arr){
     int totalsum = findArraySum(arr);

     int prefSum = 0 ;
     for (int i = 0 ; i < arr.length ; i++){
         prefSum += arr[i];
         int SuffixSum = totalsum- prefSum ;
         if (SuffixSum == prefSum){
             return true ;
         }
     }
     return false ;
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
        System.out.println("Equal partition possible :"+ equalsumPartition(arr));
    }
}
