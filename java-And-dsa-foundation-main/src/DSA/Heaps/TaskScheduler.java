package DSA.Heaps;
import java.util.*;

public class TaskScheduler {

    static int leastInterval(int K, char tasks[]) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char t : tasks) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        // Max-heap (highest frequency first)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.addAll(map.values());

        // cooldown queue: [remainingCount, readyTime]
        Queue<int[]> cooldown = new LinkedList<>();

        int time = 0;

        while (!maxHeap.isEmpty() || !cooldown.isEmpty()) {
            time++;

            if (!maxHeap.isEmpty()) {
                int count = maxHeap.poll() - 1; // run task
                if (count > 0) {
                    cooldown.add(new int[]{count, time + K});
                }
            }

            // check if front of cooldown is ready
            if (!cooldown.isEmpty() && cooldown.peek()[1] == time) {
                maxHeap.add(cooldown.poll()[0]);
            }
        }
        return time;
    }
}
