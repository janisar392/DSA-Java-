package GeeksForGeeks;
import java.util.*;

public class shopInCandyStore {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k){
        int n = prices.length;
        Arrays.sort(prices);
        int i =0 , j =n-1;
        int minCost =0;
        while(i <= j){
            minCost += prices[i];
            i++;
            j -= k;
        }
        int maxCost =0;
         i=0 ;
         j =n-1;
        while(i <= j){
            maxCost += prices[j];
            j--;
            i += k;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(minCost);
        ans.add(maxCost);
        return ans;
    }
}
