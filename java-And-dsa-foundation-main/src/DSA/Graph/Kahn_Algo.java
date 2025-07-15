package DSA.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Kahn_Algo {

    static int[] topoSort(int V , ArrayList<ArrayList<Integer>> adj){
        int inDegree[] = new int[V];
        for(int i=0 ; i< V ;i++){
            for(int node : adj.get(i)){
                inDegree[node]++;
            }
        }
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i =0 ; i< V ; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        int topo[] = new int[V];
        int i =0;
        while(!q.isEmpty()){
            int node = q.poll();
            topo[i++] = node;

            for(int it : adj.get(node)){
                inDegree[it]--;
                if(inDegree[it] == 0){
                    q.add(it);
                }
            }
        }
        return topo;
    }
}
