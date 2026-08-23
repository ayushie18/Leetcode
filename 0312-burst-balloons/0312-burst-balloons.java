class Solution {
    public int maxCoin(int i,int j,int[]nums,int[][]dp){
        if(i>j) return 0;
        int maxi=Integer.MIN_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        for(int k=i;k<=j;k++){
            int coins=nums[i-1]*nums[k]*nums[j+1];
            int totalCoin=maxCoin(i,k-1,nums,dp)+maxCoin(k+1,j,nums,dp)+coins;
            if(totalCoin>maxi) maxi=totalCoin;
        }
        return dp[i][j]=maxi;
    }
    public int maxCoins(int[] nums) {

        int n=nums.length;

        int[] arr=new int[n+2];
        arr[0]=1;
        arr[n+1]=1;
        for(int i=0;i<n;i++){
            arr[i+1]=nums[i];
        }
        int [][] dp=new int[n+2][n+2];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }
        return maxCoin(1,n,arr,dp);
        
    }
}