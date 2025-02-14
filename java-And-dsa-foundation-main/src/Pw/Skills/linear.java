package Pw.Skills;

import java.util.Scanner;

public class linear {

    static void ques(int arr[],int x ){
        for (int i = 0; i<arr.length;i++){
            if (arr[i]==x){
                System.out.println("This is the location of target elements : "+i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array element");
        int n = sc.nextInt();



        int arr[] = new int[n];
        System.out.println("Enter "+ n +" Elements : ");
        for (int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(" Enter x :");   // no use in Issorted
        int x = sc.nextInt();

        ques(arr,x);
    }
}
