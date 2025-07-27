package DSA.Graph.MST;

import java.util.ArrayList;
import java.util.List;

public class KruskalAlgo {

    static int[] parent;
    static int[] rank ;

    static int find(int u){
        if(parent[u] != u){
            parent[u] = find(parent[u]);
        }
        return parent[u];
    }

    static void union(int u , int v){
        int pu = find(u);
        int pv = find(v);
        if(pu == pv) return;
        if(rank[pu] < rank[pv]){
            parent[pu] = pv;
        }else if (rank[pu] > rank[pv]) {
            parent[pv] = pu;
        }else {
            parent[pv] =pu;
            rank[pu]++;
        }
    }

    static int spanningTree(int V , int E , List<List<int[]>> adj){
        List<int[]> edges = new ArrayList<>();

        for(int u=0 ; u< V ; u++){
            for(int[] it : adj.get(u)){
                int v = it[0];
                int wt = it[1];
                if(u < v){
                    edges.add(new int[]{wt,u,v});
                }
            }
        }
        edges.sort((a,b) -> a[0]-b[0]);

        parent = new int[V];
        rank = new int[V];
        for(int i =0 ; i<V ; i++) parent[i] =i;

        int mstWt = 0;
        int count = 0;

        for(int[] edge : edges){
            int wt= edge[0];
            int u = edge[1];
            int v = edge[2];

            if(find(u) != find(v)){
                mstWt += wt;
                union(u,v);
                count++;
                if(count == V-1);
            }
        }
        return mstWt;
    }
}
