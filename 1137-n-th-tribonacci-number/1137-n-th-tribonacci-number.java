class Solution {
    // int [] dp=new int[38];

    // public Solution(){
    //    Arrays.fill(dp,-1);
    // }
   
    
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1||n==2) return 1;
        int [] dp=new int[38];
        Arrays.fill(dp,-1);
        if(dp[n]!=-1) return dp[n];
        return dp[n]=tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);

   }
}