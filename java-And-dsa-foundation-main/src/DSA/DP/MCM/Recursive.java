package DSA.DP.MCM;

public class Recursive {
    public static int solve(int[] arr, int i, int j) {
        if (i >= j)
            return 0;

        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int tempAns = solve(arr, i, k) +
                    solve(arr, k + 1, j) +
                    arr[i - 1] * arr[k] * arr[j];

            if (tempAns < min)
                min = tempAns;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {40, 20, 30, 10, 30};  // Dimensions: 40x20, 20x30, 30x10, 10x30
        int n = arr.length;
        System.out.println("Minimum cost of multiplication: " + solve(arr, 1, n - 1));
    }
}
