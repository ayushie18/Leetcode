class Solution {
     public int amount(int [] nums,int start, int last,int[]dp){
        if(last<start) return 0;
        if(last==start) return nums[start];
        if(dp[last]!=-1) return dp[last];

        return dp[last]=Math.max(amount(nums,start,last-1,dp),(nums[last]+amount(nums,start,last-2,dp)));

    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int[] dp1=new int[n+1];
        Arrays.fill(dp1,-1);

        int[] dp2=new int[n+1];
        Arrays.fill(dp2,-1);

        int choice1=amount(nums,0,n-2,dp1);
        int choice2=amount(nums,1,n-1,dp2);


    return Math.max(choice1,choice2);// Backward recursion
        
    }
    
}