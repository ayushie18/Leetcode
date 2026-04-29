class Solution {
    int[] dp=new int[101];
    {
        Arrays.fill(dp,-1);
    }
    public int amount(int [] nums, int idx){
        
        if(idx<0) return 0;
        if(idx==0) return nums[0];
        if(dp[idx]!=-1) return dp[idx];

        return dp[idx]=Math.max(amount(nums,idx-1),(nums[idx]+amount(nums,idx-2)));

    }
    public int rob(int[] nums) {
      int n=nums.length;
      return amount(nums,n-1);
        
    }
}