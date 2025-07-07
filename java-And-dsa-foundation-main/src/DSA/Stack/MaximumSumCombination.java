package DSA.Stack;

import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class MaximumSumCombination {

    public ArrayList<Integer> topKSumPairs(int[] A, int[] B, int K) {
       int n =A.length;
        Arrays.sort(A);
        Arrays.sort(B);

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a,b) -> Integer.compare(b[0],a[0])
        );

        Set<String> visited = new HashSet<>();

        int i = n-1 , j = n-1;
        maxHeap.offer(new int[]{A[i] + B[j] , i, j});
        visited.add(i+"#"+j);

        ArrayList<Integer> ans = new ArrayList<>();

        while(K-- > 0 && !maxHeap.isEmpty()){
            int[] top = maxHeap.poll();
            int sum = top[0],x=top[1],y=top[2];
            ans.add(sum);

            if(x-1 >= 0){
                String key = (x-1)+"#"+y;
                if(!visited.contains(key)){
                    maxHeap.offer(new int[]{A[x-1] + B[y] ,x-1,y});
                    visited.add(key);
                }
            }
            if(y-1 >= 0){
                String key = x+"#"+(y-1);
                if(!visited.contains(key)){
                    maxHeap.offer(new int[]{A[x] + B[y-1] ,x,y-1});
                    visited.add(key);
                }
            }

        }
        return ans;
    }
}
