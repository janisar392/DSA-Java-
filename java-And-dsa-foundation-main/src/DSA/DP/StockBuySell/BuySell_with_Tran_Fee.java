package DSA.DP.StockBuySell;

public class BuySell_with_Tran_Fee {

    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int hold = -prices[0];
        int profit =0;

        for(int i = 1 ; i < n ;i++){
            hold = Math.max(hold , profit - prices[i]);
            profit = Math.max(profit , hold + prices[i] - fee);
        }
        return profit;
    }
}
