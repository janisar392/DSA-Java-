package DSA.Graph;
import  java.util.*;

public class course1{
    public boolean canFinish(int NC, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0 ; i< NC ; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : prerequisites){
            int u = edge[0] , v = edge[1];
            adj.get(v).add(u);
        }

        int[] inDegree = new int[NC];
        for(int i =0 ; i< NC ; i++){
            for(int node : adj.get(i)){
                inDegree[node]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0 ; i< NC ; i++){
            if(inDegree[i] ==0){
                q.add(i);
            }
        }
        List<Integer> topo = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.poll();
            topo.add(node);

            for(int it : adj.get(node)){
                inDegree[it]--;
                if(inDegree[it]==0){
                    q.add(it);
                }
            }
        }
        return  NC == topo.size();
    }
}

