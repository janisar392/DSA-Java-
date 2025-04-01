package DSA.BinarySearch;

public class RowsWithMax1 {

    public static int rowWithMax1s(int[][] arr , int n ,int m){
        int maxRow =-1;
        int maxCount =0;
        int col = m-1;  // start with the last column

        for(int i=0 ; i<n ; i++){

            while(col >= 0 && arr[i][col] ==1){
                col--;
                maxRow =i;
                maxCount = m-col-1;
            }
        }
        if (maxCount > 0) {
            return maxRow;
        } else {
            return -1;
        }
    }
}
