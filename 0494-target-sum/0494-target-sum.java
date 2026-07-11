class Solution {
    public int countSubsetSum(int i,int[] nums,int val,int[][]dp){
        if(i==0){
            return val==0?1:0;
        }
        if(dp[i][val]!=-1){
            return dp[i][val];
        }
        if(nums[i-1]<=val){
            dp[i][val]=countSubsetSum(i-1,nums,val-nums[i-1],dp)+countSubsetSum(i-1,nums,val,dp);
        }
        else{
            dp[i][val]=countSubsetSum(i-1,nums,val,dp);
        }
        return dp[i][val];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int ele:nums){
            sum+=ele;
        }
        
        if((sum+target)%2!=0 || sum<Math.abs(target)) return 0;
        int val=(sum+target)/2;
        int[][] dp=new int[n+1][val+1];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        return countSubsetSum(n,nums,val,dp);
    }
}