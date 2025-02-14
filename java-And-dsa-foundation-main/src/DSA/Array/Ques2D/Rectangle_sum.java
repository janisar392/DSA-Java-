package DSA.Array.Ques2D;

import java.util.Scanner;

public class Rectangle_sum {

    static void find_Prefix_sum_Matrix(int [][] matrix ){
        int r = matrix.length;
        int c = matrix[0].length;
        // transvrese horizontaly to calculate row wise prefix sum
        for (int i = 0 ; i< r ; i++){
            for (int j =1 ; j < c ; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

    }

    static int FindSum2(int[][] matrix , int l1, int r1, int l2 , int r2 ){
        int sum = 0;
        find_Prefix_sum_Matrix(matrix);

        for (int i = l1 ;i <= l2 ; i++){
            // r1 and r2 sum for row i
         if (r1 >= 1)
            sum += matrix[i][r2] - matrix[i][r1-1];
         else
             sum += matrix[i][r2];
        }

       return sum ;
    }


    static int FindSum(int[][] matrix , int l1, int r1, int l2 , int r2 ){
        int sum = 0;
        for (int i= l1 ; i <= l2 ;i++){
            for (int j = r1 ; j <= r2 ; j ++){
                sum += matrix[i][j];
            }
        }

        return sum;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter NUmber of Rows and Column : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter "+r*c+ " Elements :");
        for (int i= 0 ; i< r ; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boundaries l1 ,r1 , l2 , r2 :");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle Sum " + FindSum(matrix,l1 ,r1 ,l2 , r2));
        System.out.println("Rectangle Sum " + FindSum2(matrix,l1 ,r1 ,l2 , r2));
    }

}

