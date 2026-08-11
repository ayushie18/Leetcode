class Solution {
    public int steps(int n,int[]dp){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];

         dp[n]=steps(n-1,dp)+steps(n-2,dp);
         return dp[n];
        
    }

    public int climbStairs(int n) {
        if (n <= 2) return n;

        // int prev1 = 1; // ways to reach step 1
        // int prev2 = 2; // ways to reach step 2

        // for (int i = 3; i <= n; i++) {
        //     int curr = prev1 + prev2;
        //     prev1 = prev2;
        //     prev2 = curr;
        // }

        // return prev2;
        int [] dp=new int[n+1];
        // Arrays.fill(dp,-1);
        // return steps(n,dp);

        dp[0]=0;
        dp[1]=1;
        dp[2]=2;

        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];

        
    }
}