class Solution {
    public int TotalWays(int i,int amount,int[] coins,int[][]dp){
        if(amount==0) return 1;
        if(i==coins.length) return 0;

        int take=0;
        if(dp[i][amount]!=-1) return dp[i][amount];
        if(coins[i]<=amount){
            take=TotalWays(i,amount-coins[i],coins,dp);

        }
        
        int skip=TotalWays(i+1,amount,coins,dp);
        return dp[i][amount]=take+skip;
        

    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int dp[][]=new int[n+1][amount+1];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }

        int ways=TotalWays(0,amount,coins,dp);
      
        return ways;

    }
}