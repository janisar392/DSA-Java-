package GeeksForGeeks;

import java.util.Arrays;

public class countCo_Prime {
    int cntCoprime(int[] arr) {
        int maxVal = 0;
        for (int num : arr) {
            maxVal = Math.max(maxVal, num);
        }

        int[] freq = new int[maxVal + 1];
        for (int num : arr) {
            freq[num]++;
        }

        int[] cnt = new int[maxVal + 1];
        for (int i = 1; i <= maxVal; i++) {
            for (int j = i; j <= maxVal; j += i) {
                cnt[i] += freq[j];
            }
        }

        int[] mobius = computeMobius(maxVal + 1);

        long res = 0;
        for (int i = 1; i <= maxVal; i++) {
            if (cnt[i] >= 2) {
                long pairs = (1L * cnt[i] * (cnt[i] - 1)) / 2;
                res += (long) mobius[i] * pairs;
            }
        }

        return (int) res;
    }

    private int[] computeMobius(int n) {
        int[] mu = new int[n];
        Arrays.fill(mu, 1);
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                for (int j = i; j < n; j += i) {
                    mu[j] *= -1;
                    if (j > i) isPrime[j] = false;
                }
                for (long j = 1L * i * i; j < n; j += i * i) {
                    mu[(int) j] = 0;
                }
            }
        }

        mu[0] = 0;
        return mu;
    }
}
