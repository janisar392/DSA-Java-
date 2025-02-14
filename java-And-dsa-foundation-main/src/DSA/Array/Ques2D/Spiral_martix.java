package DSA.Array.Ques2D;

import java.util.Scanner;

public class Spiral_martix {

    static void printMatrix(int Matrix[][] ){
        for (int i =0 ;i < Matrix.length ;i++ ){
            for (int j= 0 ; j < Matrix[i].length ; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void printSpiralMatrix(int[][] matrix , int r , int c){
        int TopRow = 0 , BottamRow = r-1 , LeftCol = 0 , RightCol = c-1 ;
         int Total_elements = 0 ;
        while (Total_elements < r*c){
            // top row--- left colman to right column
            for (int j = LeftCol ;j <= RightCol && Total_elements < r*c ;j++){
                System.out.print(matrix[TopRow][j]+" ");
                Total_elements++;
            }
            TopRow++;

            // Right column ----Top row to Bottom Row
            for (int i = TopRow ; i <= BottamRow && Total_elements < r*c; i++){
                System.out.print(matrix[i][RightCol]+" ");
                Total_elements++;
            }
            RightCol--;

            //Bottom row ----- Right column to Left Column
            for (int j = RightCol ; j >= LeftCol && Total_elements < r*c ; j--){
                System.out.print(matrix[BottamRow][j]+" ");
                Total_elements++;
            }
            BottamRow--;

            // Left Column ---Bottom Row to Top Row
            for (int i = BottamRow ; i >= TopRow && Total_elements < r*c ; i-- ){
                System.out.print(matrix[i][LeftCol]+" ");
                Total_elements++;
            }
            LeftCol++;

        }

    }

    public static void main(String[] args) {
        System.out.println("Enter Number of Rows and Column");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int Matrix[][] = new int[r][c];
        System.out.println("Enter "+r*c+ " Elements");
        for (int i =0 ; i < r ; i++){
            for (int j = 0 ; j < c ; j++){

                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("input Matrix : ");
        printMatrix(Matrix);


        System.out.println("Spiral MAtrix ");
        printSpiralMatrix(Matrix , r , c);


    }

}
