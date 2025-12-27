public class buy_sell_stock1 {
    public int maxProfit(int[] prices){
        int maxProfit = 0; // Initialize profit equal to 0
        int buyPrice = prices[0]; // Initialize buy price to the first price
        for(int i = 1; i< prices.length; i++){
            if(prices[i] < buyPrice){ // Found a lower buy price
                buyPrice = prices[i]; // Update buy price
            }
            maxProfit = Math.max(maxProfit, prices[i] - buyPrice); // Calculate profit if selling at current price
        }
        return maxProfit;
    }
}
