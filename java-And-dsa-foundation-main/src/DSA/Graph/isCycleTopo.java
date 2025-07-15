package DSA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class isCycleTopo {
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        int[] inDegree = new int[V];
        for(int i=0 ; i<V ;i++){
            for(int j : adj.get(i)){
                inDegree[j]++;
            }
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0 ; i< V ;i++){
            if(inDegree[i] ==0){
                q.add(i);
            }
        }
        int count =0;
        while (!q.isEmpty()){
            int node = q.poll();
            count++;

            for(int i : adj.get(node)){
                inDegree[i]--;
                if(inDegree[i] ==0) q.add(i);
            }
        }
        if(count == V) return false;
        return true;
    }
}
