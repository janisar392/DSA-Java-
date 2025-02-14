import java.util.Scanner;

public class rotate_in_place {

    static void swap(int arr[] ,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;

    }


    static void reverse(int[] arr , int i ,int j){
        while (i < j){
            swap(arr ,i , j);
            i++;
            j--;
        }
    }

    static void rotateInPlace (int arr[] , int k){
        int n = arr.length;
        k = k % n;

        reverse(arr,0,n-k-1);
        reverse(arr ,n , n-1);
        reverse(arr, 0 ,n-1);
    }

    static void printArrays(int arr[]){
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+ n+" Elements");
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();


        }
        System.out.println("Enter k");
        int k = sc.nextInt();

        System.out.println("Elements before rotate");
        printArrays(arr);

        System.out.println("Elements after rotate");
        rotateInPlace(arr , k);
        printArrays(arr);

    }
}
