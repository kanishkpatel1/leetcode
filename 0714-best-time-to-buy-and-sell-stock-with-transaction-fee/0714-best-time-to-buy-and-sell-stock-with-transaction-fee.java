class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[] profit=new int[prices.length];
        int[] effectivebuy=new int[prices.length];
        profit[0]=0; 
        effectivebuy[0]=prices[0];
        for(int i=1;i<prices.length;i++){
             // formula for calculate profit each step
            profit[i]=Math.max(profit[i-1],prices[i]-effectivebuy[i-1]-fee); 
            // formula for calculate effectivebuying price each step
            effectivebuy[i]=Math.min(effectivebuy[i-1],prices[i]-profit[i]);   

        }
        return profit[profit.length-1];
    }
}