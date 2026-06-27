class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int ele:nums){
            sum+=ele;
        }

        if(sum%2!=0) return false;
        int target=sum/2;
        Boolean dp[][] =new Boolean[n+1][target+1];

        return subsetSum(n,nums,target,dp);
    }
    public boolean subsetSum(int n,int[] nums,int target,Boolean[][]dp){
        if(target==0) return true;
        if(n==0) return false;
        if(dp[n][target]!=null) return dp[n][target];

        boolean pick=false;
        if(nums[n-1]<=target){
           pick =subsetSum(n-1,nums,target-nums[n-1],dp);
        }
           boolean skip=subsetSum(n-1,nums,target,dp);
         

        dp[n][target]=pick||skip;   

        return dp[n][target];
         
    }
}