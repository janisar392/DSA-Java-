package DSA.Heaps;
import java.util.*;

public class HandsOfStraights {

    static boolean isStraightHand(int N, int groupSize, int hand[]) {
        if (N % groupSize != 0) return false;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int card : hand) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(map.keySet());
        while (!minHeap.isEmpty()) {
            int first = minHeap.peek();

            for (int i = 0; i < groupSize; i++) {
                int card = first + i;
                if (!map.containsKey(card)) return false;

                map.put(card, map.get(card) - 1);
                if (map.get(card) == 0) {
                    map.remove(card);
                    // Remove from heap only if it's currently at the top
                    if (card == minHeap.peek()) {
                        minHeap.poll();
                    }
                }
            }
        }
        return true;
    }
}
