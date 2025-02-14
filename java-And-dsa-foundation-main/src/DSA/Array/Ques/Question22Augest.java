package DSA.Array.Ques;

import java.util.Arrays;
import java.util.Scanner;
public class Question22Augest {

    static int[] SmallestAndLargest(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans ;
    }

    static boolean IsSorted(int arr[]){
        boolean cheak = true ;
        for (int i = 1 ; i < arr.length ;i++){
            if (arr[i]<arr[i-1]){
                cheak = false;
                break;
            }
        }
        return cheak ;
    }


    static int GreaterNumber(int arr[] ,int x ){
        int GreaterNo = 0 ;
        for (int i = 0 ; i< arr.length ; i++){
            if (arr[i] > x){
                GreaterNo++;
            }
        }
        return GreaterNo ;
    }


    static int lastOccurence(int arr[] , int x ){
        int ans = -1;
        for(int i = 0 ; i<arr.length ; i++){
            if (arr[i]==x){
                ans = i;
            }
        }
        return ans ;
    }


    static int countOccurrence(int arr[] , int x){
        int count = 0;
        for (int i=0; i< arr.length; i++){
            if( arr[i]==x){
                count ++ ;
            }
        }
        return count;
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

        System.out.println("-----------countOccurrence-------------");

        System.out.println("COUNT OF X " + countOccurrence(arr ,x));

        System.out.println("-----------------LastOccurence----------------");

        System.out.println("LAST OCCURENCE OF "+ x +" At index : " + lastOccurence(arr, x));


        System.out.println("------------------GreaterNumberthan------------------");

        System.out.println("GREATER Number than "+x+" is : " + GreaterNumber(arr ,x));


        System.out.println("IS Sorted "+ IsSorted(arr));



        int[] ans = SmallestAndLargest(arr);
        System.out.println("Smallest : "+ arr[0]);
        System.out.println("Largest : " + arr[arr.length-1]);
    }
}

