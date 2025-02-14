package DSA.Array.Ques2D;

import java.util.Scanner;

public class Generate_Spiral_Matrix {

    static void printMatrix(int Matrix[][] ){
        for (int i =0 ;i < Matrix.length ;i++ ){
            for (int j= 0 ; j < Matrix[i].length ; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] Generate_Spiral_Matrix(int n){
        int[][] matrix = new int[n][n];

        int TopRow = 0 , BottamRow = n-1 , LeftCol = 0 , RightCol = n-1 ;
        int Current_element = 1 ;
        
        while (Current_element <= n*n){
            // top row--- left colman to right column
            for (int j = LeftCol ;j <= RightCol && Current_element <= n*n ;j++){
                matrix[TopRow][j] = Current_element;
                Current_element++;
            }
            TopRow++;

            // Right column ----Top row to Bottom Row
            for (int i = TopRow ; i <= BottamRow && Current_element <= n*n; i++){
                matrix[i][RightCol] = Current_element;
                Current_element++;
            }
            RightCol--;

            //Bottom row ----- Right column to Left Column
            for (int j = RightCol ; j >= LeftCol && Current_element <= n*n ; j--){
                matrix[BottamRow][j] = Current_element;
                Current_element++;
            }
            BottamRow--;

            // Left Column ---Bottom Row to Top Row
            for (int i = BottamRow ; i >= TopRow && Current_element <= n*n ; i-- ){
                matrix[i][LeftCol] = Current_element;
                Current_element++;
            }
            LeftCol++;

        }
     return matrix;
    }

    public static void main(String[] args) {
        System.out.println("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = Generate_Spiral_Matrix(n);
        printMatrix(matrix);

    }

}

