package DSA.GreedyAlgo;

import java.util.Arrays;

public class minPlatformReq {
    public int minPlatform(int arr[], int dep[]){

        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i =0 , j =0;
        int platform =0 , count =0;

        while(i < n){
            if(arr[i] <= dep[j]){
                count++;
                i++;
            }else{
                count--;
                j++;
            }
            platform = Math.min(count , platform);
        }
        return platform;
    }
}
