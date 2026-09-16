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

        //    int left=0; ALL TEST CASES NOT PASSED WITH THIS OPTIMISATION 
        //    if(dp[i][k]!=-1){
        //     left=dp[i][k];
        //    }
        //    else{
        //     left=cuts(i,k,s,dp);
        //     dp[i][k]=left;
        //    } 
        //    int right=0;
        //    if(dp[k+1][j]!=-1){
        //     right=dp[k+1][j];
        //    }
        //    else{
        //     right=cuts(k+1,j,s,dp);
        //     dp[k+1][j]=right;
        //    }

        //   // int total=1+cuts(i,k,s,dp)+cuts(k+1,j,s,dp);
        //    int total=1+left+right;
        //    min=Math.min(total,min);
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