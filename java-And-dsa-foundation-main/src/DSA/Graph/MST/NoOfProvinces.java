package DSA.Graph.MST;
import java.util.*;

public class NoOfProvinces {

    static int[] parent;

    static int find(int u){
        if(parent[u] != u){
            parent[u] = find(parent[u]);
        }
        return parent[u];
    }
    static void union(int u , int v){
        int pu = find(u);
        int pv = find(v);

        if(pu != pv){
            parent[pu] = pv;
        }
    }

    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V){
        parent = new int[V];
        for(int i=0 ; i< V ; i++){
            parent[i] =i;
        }

        for(int i=0 ; i< V ; i++){
            for(int j=0 ; j< V ; j++){
                if(adj.get(i).get(j) ==1){
                    union(i,j);
                }
            }
        }
        int count =0 ;
        for(int i=0 ;i<V ; i++){
            if(find(i) == i){
                count++;
            }
        }
        return count;
    }
}
