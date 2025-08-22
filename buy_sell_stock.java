class buy_sell_stock {
    public int maxProfit(int[] prices) {
        int buy = prices[0], sell = 0, profit=0, index=0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
                index = i;
            }    
        }
        for(int i = index + 1; i < prices.length; i++){
            if(prices[i] > sell){
                sell = prices[i];
            }
            profit = Math.max(profit, prices[i] - buy);
        }

        // profit = sell - buy;
        return Math.max(0, profit);
    }
}