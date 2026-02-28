public class Code5 {
    public static int maxProfit(int[] prices) {
        int buy= Integer.MAX_VALUE;
        int maxProfit = 0;
        int profit;
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
    public static void main(String[] args) {
        int prices[]= {1,2,5,2,7};
        System.out.println("max profit = "+ maxProfit(prices));
    }
}
