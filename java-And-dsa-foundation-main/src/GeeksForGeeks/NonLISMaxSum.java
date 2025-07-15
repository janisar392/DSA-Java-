package GeeksForGeeks;
import java.util.*;
public class NonLISMaxSum {
    public int nonLisMaxSum(int[] arr) {
        int n = arr.length;
        int total = 0, maxLen = 1, LisSum = Integer.MAX_VALUE;
        int[] len = new int[n];
        int[] sum = new int[n];
        Arrays.fill(len, 1);

        for (int i = 0; i < n; i++) {
            sum[i] = arr[i];
            total += arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    if (len[j] + 1 > len[i]) {
                        len[i] = len[j] + 1;
                        sum[i] = sum[j] + arr[i];
                    } else if (len[j] + 1 == len[i]) {
                        sum[i] = Math.min(sum[i], sum[j] + arr[i]);
                    }
                }
            }
            maxLen = Math.max(maxLen, len[i]);
        }

        for (int i = 0; i < n; i++) {
            if (len[i] == maxLen) {
                LisSum = Math.min(LisSum, sum[i]);
            }
        }
        return total - LisSum;
    }
}
