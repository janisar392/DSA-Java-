package DSA.Array.LeetCode;

public class setZeroes {
    public static void zeroMatrix(int[][] matrix , int n , int m){
        int[] row = new int[n];
        int[] col = new int[m];

        for(int i=0 ; i< n ;i++){
            for(int j=0 ; j<m ; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j < m ; j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
