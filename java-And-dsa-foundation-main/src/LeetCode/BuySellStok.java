package LeetCode;

public class BuySellStok {

    public int buySellStock(int[] prices){
        int buy =prices[0];
        int profit = 0;

        for(int i =0 ; i< prices.length ; i++){
            profit = Math.max(profit , prices[i] - buy);
            buy = Math.min(buy, prices[i]);
        }
        return profit;
    }
}
