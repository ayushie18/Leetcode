class Solution {
    long [][]dp;
    public long solve(int[] nums,int x,int i,int parity){
     if(i==nums.length) return 0;

     if(dp[i][parity]!=-1){
        return dp[i][parity];
     }
     long pick=0;
     if(nums[i]%2==parity){
        pick=nums[i]+solve(nums,x,i+1,nums[i]%2);
     }
     else{
        pick=nums[i]-x+solve(nums,x,i+1,nums[i]%2);
     }

     long skip=solve(nums,x,i+1,parity);
     dp[i][parity]=Math.max(pick,skip);

      return dp[i][parity];
    }
    public long maxScore(int[] nums, int x) {
        int n=nums.length;
        dp=new long[n+1][2];
        int parity=nums[0]%2;
         for(long [] row:dp){
           Arrays.fill(row,-1);
         }
        return  nums[0]+solve(nums,x,1,parity);
        
    }
}