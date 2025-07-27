package DSA.Graph.MST;

public class ConnetingTheGraph {
    int[] parent;

    int find(int u){
        if(parent[u] != u)
            parent[u] = find(parent[u]);
        return parent[u];
    }
    void union (int u, int v){
        int pu = find(u);
        int pv = find(v);
        if(pu != pv){
            parent[pu] =pv;
        }
    }
    public int Solve(int n, int[][] edges) {
        parent = new int[n];
        for(int i=0; i<n ; i++) parent[i] = i;

        int extraEdges =0;

        for(int[] edge :edges ){
            int u = edge[0], v = edge[1];
            if(find(u) == find(v)){
                extraEdges++;
            }
            else{
                union(u,v);
            }
        }

        int ul_p = 0;
        for(int i=0 ; i< n ; i++){
            if(find(i) == i) ul_p++;
        }
        int ans = ul_p-1;
        return extraEdges >= ans ? ans : -1;
    }
}
