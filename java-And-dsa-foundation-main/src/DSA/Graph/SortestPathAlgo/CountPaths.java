package DSA.Graph.SortestPathAlgo;

import java.util.*;

public class CountPaths {
    static int MOD = 1_000_000_007;

    public int countPaths(int n , int[][] roads){

        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0; i< n ;i++) adj.add(new ArrayList<>());

        for(int[] road : roads){
            int u = road[0],v= road[1] ,time = road[2];
            adj.get(u).add(new int[]{v,time});
            adj.get(v).add(new int[]{u,time});
        }
        int[] dist = new int[n];
        int[] ways = new int[n];
        Arrays.fill(dist , Integer.MAX_VALUE);
        dist[0] =0 ;
        ways[0] =1 ;

        PriorityQueue<int[]> pq =new PriorityQueue<>((a,b)-> a[0]-b[0]);
        pq.offer(new int[]{0,0});

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int time = curr[0] , node = curr[1];

            if(time > dist[node]) continue;

            for(int[] edge : adj.get(node)){
                int next = edge[0], wt = edge[1];
                int newDist = time + wt;

                if(newDist < dist[next]){
                    dist[next] = newDist;
                    ways[next] = ways[node];
                    pq.offer(new int[]{newDist, next});
                }else if(newDist == dist[next]) {
                    ways[next] = (ways[next] + ways[node]) % MOD;
                }
            }
        }
        return ways[n-1];
    }
}
