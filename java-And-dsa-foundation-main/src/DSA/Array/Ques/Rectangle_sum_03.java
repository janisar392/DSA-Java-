package DSA.Array.Ques;

import java.util.Scanner;

public class Rectangle_sum_03 {

    // calculate row wise and column wise sum
    //  matrix[i][j] = sum of rectangle (0,0) and ( i , j)
    static void find_prefixSum(int matrix[][]){
        int r = matrix.length;
        int c = matrix.length;
        //transverse horizontaly to calculate row wise prefix sum

        for (int i = 0 ; i < r ; i++){
            for (int j = 1 ; j < c ; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }
        //transerse vertically to calculate column wise sum
        for (int j = 0 ; j < c ; j++  ){
            for (int i = 1 ; i< r ; i ++){
                matrix[i][j] += matrix[i-1][j];
            }
        }

    }

    static int findsum3(int matrix[][] ,int l1 ,int r1 , int l2 , int r2 ){
        int ans = 0 , sum = 0 , left = 0 , leftup = 0 , up = 0 ;
    find_prefixSum(matrix);

       sum = matrix[l2][r2];
       if (l1>= 1)
       up = matrix[l1-1][r2];
       if (r1 >= 1)
       left = matrix[l2][r1-1];
       if (l1 >= 1)
       leftup = matrix[l1-1][r1-1];

       ans = sum - up - left + leftup ;
        return ans ;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows and Column :");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int matrix[][] = new int[r][c] ;
        System.out.println("Enter " +r*c +" Elements :");
        for (int i = 0 ; i < r ; i++ ){
            for (int j = 0 ; j < c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boundaries l1 , r1 , l2 , r2 ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle Sum "+ findsum3(matrix , l1 ,r1 , l2 , r2));


    }

}
