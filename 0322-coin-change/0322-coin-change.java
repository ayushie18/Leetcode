class Solution {
    public int helper(int i,int[] coins,int amount,int[][]dp){
        if(amount==0) return 0;
        if(i==coins.length) return (int)1e9;
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        if(coins[i]<=amount){
            dp[i][amount]=Math.min((1+helper(i,coins,amount-coins[i],dp)),helper(i+1,coins,amount,dp));

        }
        else{
            dp[i][amount]=helper(i+1,coins,amount,dp);
        }
        return dp[i][amount];

    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }
        int count=helper(0,coins,amount,dp);
        if(count>=(int)1e9) return -1;

        return count;
       
        
    }
}