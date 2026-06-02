class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        //int buyPrice=Integer.MAX_VALUE;
        int buyPrice=prices[0]; 
        int maxProfit=0;
        for(int i=1;i<n;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
            else{
                buyPrice=prices[i];
            }
        }

       return maxProfit; 
        
    }
}