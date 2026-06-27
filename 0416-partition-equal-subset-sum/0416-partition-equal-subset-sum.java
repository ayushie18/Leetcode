class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int ele:nums){
            sum+=ele;
        }

        if(sum%2!=0) return false;
        int target=sum/2;
        int dp[][] =new int[n+1][target+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        return subsetSum(n,nums,target,dp);
    }
    public boolean subsetSum(int n,int[] nums,int target,int[][]dp){
        if(target==0) return true;
        if(n==0) return false;
        if(dp[n][target]!=-1) return( dp[n][target]==1);

        boolean ans=false;
        boolean pick=false;
        if(nums[n-1]<=target){
           pick =subsetSum(n-1,nums,target-nums[n-1],dp);
        }
           boolean skip=subsetSum(n-1,nums,target,dp);
           ans=pick||skip;
         


        if(ans){
            dp[n][target]=1;
        }
        else dp[n][target]=0;

    return ans;    
       
    }
}