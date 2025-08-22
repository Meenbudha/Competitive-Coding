public class buy_sell_stock1 {
    public int maxProfit(int[] prices){
        int maxProfit = 0, buyPrice = prices[0];
        for(int i = 1; i< prices.length; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
        }
        return maxProfit;
    }
}
