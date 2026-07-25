class Solution {
    public int lcs(StringBuilder x ,StringBuilder y,int n,int m,int[][]dp){
        if(m==0||n==0) return 0;
        if(dp[n-1][m-1]!=-1) return dp[n-1][m-1];
        if(x.charAt(n-1)==y.charAt(m-1)){
            dp[n-1][m-1]=1+lcs(x,y,n-1,m-1,dp);
        }
        else{
            dp[n-1][m-1]=Math.max(lcs(x,y,n,m-1,dp),lcs(x,y,n-1,m,dp));
        }
        return dp[n-1][m-1];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        StringBuilder x=new StringBuilder(text1);
        StringBuilder y=new StringBuilder(text2);
        int n=text1.length();
        int m=text2.length();
        int[][]dp=new int[n][m];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        return lcs(x,y,n,m,dp);

    }
}