package DSA.Array.Ques2D;


import java.util.Scanner;

public class TransposeOfMatInPlace {

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void Transpose(int a[][] , int r , int c){    // ONLY APPLICABLE FOR SQUARE MATRIX

        for (int i = 0 ; i < c ; i++){
            for (int j = i ; j < r ; j++ ){

                int temp = a[i][j];
                a[i][j] = a[j][i] ;
                a[j][i] = temp ;
            }
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


        System.out.println("Transpose of Matrix : ");
        Transpose(a , r ,c);
        printMatrix(a);

    }

}

