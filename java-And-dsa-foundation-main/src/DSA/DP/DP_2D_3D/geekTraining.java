package DSA.DP.DP_2D_3D;

public class geekTraining {

    public int maximumPoints(int arr[][]) {
        // code here
        int n = arr.length;
        int[] prev = new int[3];
        prev[0] = arr[0][0];
        prev[1] = arr[0][1];
        prev[2] = arr[0][2];

        for(int i =1 ; i< n ; i++){
            int[] curr = new int[3];
            curr[0] = arr[i][0] + Math.max(prev[1], prev[2]);
            curr[1] = arr[i][1] + Math.max(prev[0], prev[2]);
            curr[2] = arr[i][2] + Math.max(prev[0], prev[1]);

            prev = curr;
        }
        return Math.max(prev[0], Math.max(prev[1], prev[2]));
    }
}
