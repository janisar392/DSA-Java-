package DSA.Graph.SortestPathAlgo;

import java.util.Arrays;

public class FindMinCity {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        int[][] dist = new int[n][n];
        int INF = (int)1e9;

        for(int i=0 ; i< n ;i++){
            Arrays.fill(dist[i],INF);
            dist[i][i] = 0;
        }
        for(int[] edge : edges){
            int u = edge[0], v =edge[1], w = edge[2];
            dist[u][v] = w;
            dist[v][u] = w;
        }
        for(int k =0 ; k< n ; k++){
            for(int i=0; i< n ;i++){
                for(int j=0 ; j< n ;j++){
                    if(dist[i][k] < INF && dist[k][j] < INF){
                        dist[i][j] = Math.min(dist[i][j] , dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
        int cntCity = n;
        int cityNo = -1;

        for(int i=0 ; i<n ; i++){
            int count =0;

            for(int j =0 ; j< n ;j++){
                if(i != j && dist[i][j] <= distanceThreshold){
                    count++;
                }
            }
            if(count <= cntCity){
                cntCity = count;
                cityNo =i;
            }
        }
        return cityNo;
    }
}
