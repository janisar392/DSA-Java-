package DSA.Graph;
import java.util.*;

public class EventualSafeStates {

    List<Integer> eventualSafeNodes(int n, List<List<Integer>> adj) {

        ArrayList<ArrayList<Integer>> rAdj = new ArrayList<>();
        for(int i =0 ; i < n ; i++) rAdj.add(new ArrayList<>());
        for(int u =0 ; u < n ; u++){
            for(int v : adj.get(u)){
                rAdj.get(v).add(u);
            }
        }

        int[] inDegree = new int[n];
        for(int i =0 ; i< n ; i++){
            for(int node : rAdj.get(i)){
                inDegree[node]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0 ; i< n ;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);

            for(int it : rAdj.get(node)){
                inDegree[it]--;
                if(inDegree[it]==0){
                    q.add(it);
                }
            }
        }
        Collections.sort(ans);
        return ans;

    }
}
