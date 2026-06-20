class Code163 {
    public int maxProfit(int[] prices) {
        int buy= Integer.MAX_VALUE;
        int maxProfit = 0;
        int profit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buy<prices[i])
            {
                profit = prices[i]-buy;
                maxProfit = Math.max(maxProfit,profit);
            }else
            {
                buy=prices[i];
            }
        }
        return maxProfit;
    }
}