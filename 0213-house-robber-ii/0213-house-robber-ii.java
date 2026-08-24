class Solution {
    public int amount(int s,int e,int[]nums,int[]dp){
        if(s>e) return 0;
        if(s==e) return nums[s];
        if(dp[s]!=-1) return dp[s];

        int pick=nums[s]+amount(s+2,e,nums,dp);
        int skip=amount(s+1,e,nums,dp);

        return dp[s]=Math.max(pick,skip);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[]dp1=new int[n];
        Arrays.fill(dp1,-1);

         
        int[]dp2=new int[n];
        Arrays.fill(dp2,-1);

        int choice1=amount(0,n-2,nums,dp1);
        int choice2=amount(1,n-1,nums,dp2);

        return Math.max(choice1,choice2);
    }
}