package DSA.Graph.SortestPathAlgo;
import java.util.*;

import java.util.ArrayList;

public class CheapestFlight {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k){

        List<List<int[]>> adj =new ArrayList<>();
        for(int i =0 ; i< n ;i++) adj.add(new ArrayList<>());

        for(int[] flight : flights){
            int u = flight[0], v = flight[1], price = flight[2];
            adj.get(u).add(new int[]{v,price});
        }
        int[] costTo = new int[n];
        Arrays.fill(costTo, Integer.MAX_VALUE);
        costTo[src] =0;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{src , 0,0});  // node , cost, stops

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int node = curr[0];
            int cost = curr[1];
            int stops= curr[2];

            if(stops > k) continue;

            for (int[] it : adj.get(node)){
                int nextNode = it[0];
                int wt = it[1];
                int newCost = cost + wt;

                if(newCost < costTo[nextNode]){
                    costTo[newCost] = newCost;
                    q.offer(new int[]{nextNode , newCost , stops+1});
                }
            }
        }
        return costTo[dst] == Integer.MAX_VALUE ? -1 : costTo[dst];
    }
}
