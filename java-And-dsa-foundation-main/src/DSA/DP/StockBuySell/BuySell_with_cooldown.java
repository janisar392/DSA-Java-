package DSA.DP.StockBuySell;

public class BuySell_with_cooldown {

    public int maxProfit(int[] prices) {
        int n = prices.length;

        int hold = - prices[0];
        int sold = 0;
        int rest = 0;

        for(int i =0 ; i< n ; i++){
            int prevSold = sold;

            sold = hold + prices[i];
            hold = Math.max(hold , rest - prices[i]);
            rest = Math.max(rest , prevSold);
        }
        return Math.max(rest , sold);
    }
}
