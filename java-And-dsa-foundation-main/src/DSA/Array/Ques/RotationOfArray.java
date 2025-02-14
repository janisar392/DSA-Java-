package DSA.Array.Ques;

import java.util.Scanner;

public class RotationOfArray {

    static void printArray(int arr[]){
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static int[] rotate(int[] arr , int k){
        int n = arr.length;
        k = k % n ;
        int[] ans = new int[n];
        int j = 0 ;

        for (int i = n- k ; i < n ; i++){
            ans[j++] = arr[i];


        }
        for (int i = 0 ; i < n-k ; i++){
            ans[j++] = arr[i];

        }
        return ans;

    }




    public static void main(String[] args) {
        System.out.println("ENter the size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc .nextInt();

        int arr[] = new int[n];
            System.out.println("Enter "+ n+" Array element" +" ");
            for (int i = 0 ;i < arr.length ; i++){
                arr[i] = sc.nextInt();


            }
        System.out.println("how many times do you want to rotate : ");
        int k = sc.nextInt();
        System.out.println("Arrays before rotation");
        printArray(arr);



        int[] ans = rotate(arr,k);
        System.out.println("Arrays after rotation");
        printArray(ans);



    }
}
