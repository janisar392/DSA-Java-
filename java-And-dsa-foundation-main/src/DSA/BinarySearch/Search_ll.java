package DSA.BinarySearch;

public class Search_ll {
    private int findMaxInCol(int[][] mat , int col){
        int maxRow =0;
        for(int i=0; i< mat.length; i++){
            if(mat[i][col] > mat [maxRow][col]){
                maxRow = i;
            }
        }
        return maxRow;
    }

    public int[] findPeakGrid(int[][] mat){
        int m = mat.length;   //row
        int n = mat[0].length;  //col

        int left =0 , right = n-1;

        while(left <= right){
            int midCol = left+ (right-left)/2;
            int maxRow = findMaxInCol(mat,midCol);

            int leftVal =-1, rightVal =-1;

            if(midCol > 0){
                leftVal = mat[maxRow][midCol-1];
            }
            if(midCol < n-1){
                rightVal =mat[maxRow][midCol+1];
            }

            if(mat[maxRow][midCol] >leftVal && mat[maxRow][midCol] >rightVal){
                return new int[]{maxRow,midCol};
            }

            if(leftVal > mat[maxRow][midCol]){
                right = midCol-1;
            }
            else left = midCol+1;
        }
        return new int[]{-1,-1};
    }
}
