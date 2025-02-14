package DSA.Array.Ques2D;


import java.util.Scanner;

public class Transpose_Of_Matrix {

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void Transpose(int a[][] , int r , int c){

        int Trans[][] = new int[c][r];

        for (int i = 0 ; i < c ; i++){
            for (int j = 0 ; j < r ; j++ ){
                Trans[i][j] =a[j][i];
            }
        }
        printMatrix(Trans);

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

    }

}
