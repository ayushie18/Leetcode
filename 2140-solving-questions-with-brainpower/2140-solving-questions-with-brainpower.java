class Solution {
    long[]dp;
    public long solve(int[][] questions,int i){
        if(i>=questions.length) return 0;

        if(dp[i]!=-1) return dp[i];

        long skip=solve(questions,i+1);
        long pick=questions[i][0]+solve(questions,i+questions[i][1]+1);
        

        dp[i]=Math.max(pick,skip);


    return dp[i];
    }
    public long mostPoints(int[][] questions) {
        int n=questions.length;
        dp=new long[n+1];
        Arrays.fill(dp,-1);

        return solve(questions,0);
    }
}