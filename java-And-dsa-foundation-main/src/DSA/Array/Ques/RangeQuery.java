package DSA.Array.Ques;

import java.util.Scanner;

public class RangeQuery {

    static int[] makePrefixSumArray(int[] arr){
        for (int i= 1 ; i < arr.length ; i++){
            arr[i] += arr[i-1] ;
        }
        return arr ;
    }


    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n+1];
        System.out.println("Enter "+n+" Arrays");
        for (int i = 1 ; i <= n ;i++ ){    //   index 1 Applied here
            arr[i] = sc.nextInt();
        }

        int[] prefSum =  makePrefixSumArray(arr);

        System.out.println("Enter number of Queries");
        int q = sc.nextInt();

        while (q-- > 0){
            System.out.println("Enter range");
            int l = sc.nextInt();    // enter first point
            int r = sc.nextInt();    //  Enter last point of range

            int ans = prefSum[r] - prefSum[l-1];

            System.out.println("Sum : " + ans);
        }
    }
}