package DSA.Array.Ques2D;



import java.util.Scanner;

public class RotationOfMatrixBy_90 {

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void TransposeInPlace(int a[][] , int r , int c){    // ONLY APPLICABLE FOR SQUARE MATRIX

        for (int i = 0 ; i < c ; i++){
            for (int j = i ; j < r ; j++ ){

                int temp = a[i][j];
                a[i][j] = a[j][i] ;
                a[j][i] = temp ;
            }
        }
    }

    static void ReverseArray(int[] arr){
        int i= 0 , j = arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    static void rotate(int a[][] , int n){    // n = r = c ;
        TransposeInPlace(a , n ,n );

        //reverse each row of transposed matrix
        for (int i = 0 ; i < n ; i++){
            ReverseArray(a[i]);
        }

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column of  Matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        System.out.println("Enter "+r*c+" Elements");
        for (int i = 0 ; i < r ; i++){
            for (int j = 0 ; j < c ; j++ ){
                a[i][j] = sc.nextInt();
            }
        }



        System.out.println("Original Matrix : ");
        printMatrix(a);

        rotate(a,r);
        System.out.println("Rotation of Matrix : ");

        printMatrix(a);

    }

}
