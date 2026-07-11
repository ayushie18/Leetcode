class Solution {
  
    public int amount(int [] nums, int idx,int []dp){
        
        if(idx<0) return 0;
        if(idx==0) return nums[0];
        if(dp[idx]!=-1) return dp[idx];

        return dp[idx]=Math.max(amount(nums,idx-1,dp),(nums[idx]+amount(nums,idx-2,dp)));

    }
    public int rob(int[] nums) {
      int n=nums.length;
      int[] dp=new int[n];
      for(int i=0;i<n;i++){
        dp[i]=-1;
      }

      return amount(nums,n-1,dp);// Backward recursion
        
    }
}