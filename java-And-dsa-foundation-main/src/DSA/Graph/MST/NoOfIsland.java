package DSA.Graph.MST;
import java.util.*;
class DSU {
    private int[] parent;
    private int[] rank;

    public DSU(int size) {
        parent = new int[size];
        rank = new int[size];

        for (int i = 0; i < size; i++) {
            parent[i] = i;  // Each node is its own parent initially
            rank[i] = 0;    // All ranks are 0 initially
        }
    }

    // Find the root parent of x with path compression
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);  // Path compression
        }
        return parent[x];
    }

    // Union by rank
    public boolean union(int x, int y) {
        int px = find(x);
        int py = find(y);

        if (px == py) return false;  // Already connected
        // Attach smaller tree under the larger one
        if (rank[px] < rank[py]) {
            parent[px] = py;
        } else if (rank[py] < rank[px]) {
            parent[py] = px;
        } else {
            parent[py] = px;
            rank[px]++;
        }
        return true;
    }

    // Check if two nodes are connected (same root)
    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }
}

public class NoOfIsland {
    public List<Integer> numOfIslands(int rows, int cols, int[][] operators){
        List<Integer> ans = new ArrayList<>();
        DSU dsu = new DSU(rows * cols);
        boolean[][] visited = new boolean[rows][cols];
        int count =0;

        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        for(int[] op : operators){
            int r = op[0] , c = op[1];

            if(visited[r][c]){
                ans.add(count);
                continue;
            }
            visited[r][c] = true;
            count++;
            int pos = r*cols + c;
            for(int d=0 ; d < 4 ; d++){
                int nr = r+dx[d];
                int nc = c+dy[d];

                if(nr >=0 && nr < rows && nc >= 0 && nc < cols && visited[nr][nc]){
                    int newPos = nr * cols + nc;
                    if(dsu.union(pos,newPos)){
                        count--; // merge two component
                    }
                }
            }
            ans.add(count);
        }
        return ans;
    }
}
