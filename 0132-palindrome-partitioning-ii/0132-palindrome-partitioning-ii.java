class Solution {
    public boolean palindrome(int i,int j,String str){
       while(i<j){
         if(str.charAt(i)!=str.charAt(j)){
         return false;
       }
       i++;
       j--;
    }
       return true;
    }
    public int cuts(int i,int j,String s,int[][]dp){
        if(i==j|| i>j||palindrome(i,j,s)) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            if(palindrome(i,k,s)){
                int total=1+cuts(k+1,j,s,dp);
                min=Math.min(total,min);
            }
        }
        return dp[i][j]=min;
    }
    public int minCut(String s) {
        int n=s.length();
        int [][] dp=new int[n+1][n+1];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }
        return cuts(0,n-1,s,dp);


        
    }
}