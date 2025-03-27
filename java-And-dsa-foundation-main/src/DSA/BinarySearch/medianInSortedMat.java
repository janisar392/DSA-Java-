package DSA.BinarySearch;


public class medianInSortedMat {
        private static int countSmallerOrEqual(int[] row, int target) {
            int low = 0, high = row.length - 1;
            int count = 0;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (row[mid] <= target) {
                    count = mid + 1;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return count;
        }

        int median(int mat[][]) {
            int m = mat.length;
            int n = mat[0].length;

            int low = Integer.MAX_VALUE;
            int high = Integer.MIN_VALUE;

            // Find the minimum and maximum elements in the matrix
            for (int i = 0; i < m; i++) {
                if (mat[i][0] < low) {
                    low = mat[i][0];
                }
                if (mat[i][n - 1] > high) {
                    high = mat[i][n - 1];
                }
            }

            int medianPos = (m * n) / 2;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                int count = 0;
                for (int i = 0; i < m; i++) {
                    count += countSmallerOrEqual(mat[i], mid);
                }
                if (count <= medianPos) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return low;
        }
    }