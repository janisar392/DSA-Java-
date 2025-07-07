package GeeksForGeeks;

public class MaxScoreFromSubarrayMins {

    public int maxSum(int arr[]) {
        int n = arr.length;
        int maxScore=0;
        for (int i = 0; i < n - 1; i++) {
            // For every adjacent pair
            int min1 = Math.min(arr[i], arr[i + 1]);
            int min2 = Math.max(arr[i], arr[i + 1]);
            maxScore = Math.max(maxScore, min1 + min2);
        }

        return maxScore;
    }
}
