class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buyDay=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[buyDay]){
                profit=Math.max(profit,prices[i]-prices[buyDay]);
            }else{
                buyDay=i;
            }
        }
        return profit;
        
    }
}
