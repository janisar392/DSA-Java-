import java.util.Scanner;

public class printMatrix {

    static void print(int arr[][]){
        for(int i = 0 ;i< arr.length; i++){
            for(int j = 0 ; j < arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }

    static void multiplication(int arr[][] , int r , int c , int arr2[][] , int r2, int c2){
        if (c != r2){
            System.out.println("Invalid input ! multiplication not possible ");
            return;
        }
        else{

        }
    }


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter "+r*c+" Elements : ");

        int arr[][] = new int[r][c];

        for (int i = 0 ; i < arr.length; i++){
            for (int j = 0 ; j < arr.length; j++){
             arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter row 2 and column 2 : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        System.out.println("Enter "+r2*c2+" elements :");
        int arr2[][] = new int[r2][c2];
        for(int i = 0 ; i < arr2.length ; i++){
            for(int j=0 ; j < arr.length ; j++){
                arr2[i][j] =sc.nextInt();
            }
        }

        System.out.println("Matrix : ");
        print(arr);

        System.out.println("Matrix 2 : ");
        print(arr2);

        multiplication(arr,r, c,arr2 ,r2,c2);
    }
}
