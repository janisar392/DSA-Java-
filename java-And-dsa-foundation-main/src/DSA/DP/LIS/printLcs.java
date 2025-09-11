package DSA.DP.LIS;
import java.util.*;

public class printLcs {

    public ArrayList<Integer> getLIS(int arr[]) {
        // Code here
        int n = arr.length;

        int[] dp = new int[n];
        int[] parent = new int[n];
        Arrays.fill(dp, 1);

        for(int i=0 ; i< n ; i++){
            parent[i] =i;
        }

        int maxLen =1 ;
        int lastIdx =0;

        for(int i = 0 ; i< n ; i++){
            for(int j=0 ; j< i ; j++){
                if(arr[j] < arr[i] && dp[j] +1 > dp[i]){
                    dp[i] = dp[j]+1;
                    parent[i] = j;
                }
            }
            if(dp[i] > maxLen){
                maxLen = dp[i];
                lastIdx = i;
            }
        }

        ArrayList<Integer> lis = new ArrayList<>();
        while(parent[lastIdx] != lastIdx){
            lis.add(arr[lastIdx]);
            lastIdx = parent[lastIdx];
        }
        lis.add(arr[lastIdx]);
        Collections.reverse(lis);
        return lis;
    }
}
