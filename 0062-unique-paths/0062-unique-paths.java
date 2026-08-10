class Solution {
    int[][]dp;
    public int paths(int strow ,int stcol,int endR ,int endC,int[][]dp){
        if(strow>=endR || stcol>=endC){
           return 0; 
        }
        if(strow ==endR-1 && stcol==endC-1){
            return 1;
        }
        if(dp[strow][stcol]!=-1) return dp[strow][stcol];
        int rightways=paths(strow,stcol+1,endR,endC,dp);
        int downways=paths(strow+1,stcol,endR,endC,dp);

        return  dp[strow][stcol]=rightways+downways;

    }
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        // for(int []row:dp){
        // Arrays.fill(row,-1);
        // }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                }
            }
        }
        return dp[m-1][n-1];
       // return paths(0,0,m,n,dp);
        
    }
}