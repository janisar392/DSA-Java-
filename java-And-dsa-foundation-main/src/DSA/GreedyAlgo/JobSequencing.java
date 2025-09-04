package DSA.GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class JobSequencing {

    static class Job{
        int deadline , profit;

        Job(int d , int p){
            deadline =d;
            profit =p;
        }
    }

    public ArrayList<Integer> jobSequencing(int[] deadline , int[] profit){
        int n = deadline.length;

        Job[] jobs = new Job[n];
        for(int i =0 ; i<n ; i++){
            jobs[i] = new Job(deadline[i] , profit[i]);
        }

        Arrays.sort(jobs , (a,b) -> b.profit - a.profit);

        int maxDeadLine =0 ;
        for(int d : deadline){
            maxDeadLine = Math.max(maxDeadLine , d);
        }

        int[] slot = new int[maxDeadLine+1];
        Arrays.fill(slot,-1);

        int noOfJobs =0 , totalProfit =0;

        for(Job job : jobs){
            for(int j = job.deadline; j >0 ; j--){
                if(slot[j] == -1){
                    slot[j] = job.profit;
                    noOfJobs++;
                    totalProfit += job.profit;
                    break;
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(noOfJobs);
        ans.add(totalProfit);

        return ans;
    }
}
