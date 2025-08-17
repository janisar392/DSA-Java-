package DSA.Heaps;
import java.util.*;
public class SumOfElemBetK1andK2 {

    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2) {
        long first = KthSmallest(A, (int)K1);
        long last = KthSmallest(A, (int)K2);

        long sum = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > first && A[i] < last) {
                sum += A[i];
            }
        }
        return sum;
    }

    private static long KthSmallest(long[] arr, int k) {
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
}
