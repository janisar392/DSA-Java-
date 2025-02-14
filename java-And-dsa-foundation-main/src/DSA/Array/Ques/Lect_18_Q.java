package DSA.Array.Ques;

import java.util.Scanner;

public class Lect_18_Q {
    static void PrintArray(int arr[]){
        for (int i = 0 ;i < arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }
    static void EvenoddArrangement(int arr[]){
        int n = arr.length;
        int left = 0 , right = n-1 ;

        while (left<right){
            if (arr[left]%2!=0 && arr[right]%2 == 0){
                swap(arr ,left, right);
                left++;
                right--;
            }
            if (arr[left]%2==0){
                left++;
            }
            if (arr[right]%2!=0){}
            right --;

        }

    }



    static void swap( int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

        EvenoddArrangement(arr);
        System.out.println("Sorted Array");
        PrintArray(arr);


    }
}

