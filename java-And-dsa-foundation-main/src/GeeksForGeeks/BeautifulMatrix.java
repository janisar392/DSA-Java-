package GeeksForGeeks;

public class BeautifulMatrix {
    public static int balanceSums(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int maxSum =0;
        int[] rowSum = new int[n];
        int[] colSum = new int[m];

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j< m ;j++){
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }
        for(int i =0 ; i< n ;i++){
            maxSum = Math.max(maxSum,rowSum[i]);
            maxSum = Math.max(maxSum,colSum[i]);
        }
       int totOp =0 , i=0 , j=0;
        while(i < n && j < n){
            int diff = Math.min(maxSum - rowSum[i] , maxSum- colSum[j]);
            mat[i][j] += diff;
            rowSum[i] += diff;
            colSum[i] += diff;
            totOp += diff;

            if(rowSum[i] == maxSum) i++;
            if(colSum[j] == maxSum) j++;
        }
        return totOp;
    }
}
