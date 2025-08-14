package DSA.Heaps;
import java.util.*;

public class K_closest_elem {
    int[] printKClosest(int[] arr, int k, int x) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> {
            int diff1 = Math.abs(a - x);
            int diff2 = Math.abs(b - x);
            if (diff1 != diff2) {
                return diff2 - diff1; // farther first
            } else {
                return a - b; // smaller element removed first (prefer larger)
            }
        });

        for (int num : arr) {
            if (num == x) continue; // skip x
            maxHeap.offer(num);
            if (maxHeap.size() > k) {
                maxHeap.poll(); // remove farthest element
            }
        }

        List<Integer> resultList = new ArrayList<>(maxHeap);
        resultList.sort((a, b) -> {
            int diff1 = Math.abs(a - x), diff2 = Math.abs(b - x);
            if (diff1 != diff2) return diff1 - diff2; // closer first
            return b - a; // prefer larger on tie
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
