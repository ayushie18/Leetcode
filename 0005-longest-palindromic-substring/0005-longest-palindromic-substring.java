class Solution {
   public String longestPalindrome(String s) {
       int n = s.length();
        if (n <= 1) return s;
    
        boolean [][]dp=new boolean[n][n];
        int start=0 ;
        int maxLength=1;
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                start=i;
                maxLength=2;
            }
        }
    
        for(int k=3;k<=n;k++){
            for(int j=0;j<n-k+1;j++){
                int i=j+k-1;
                if(s.charAt(j)==s.charAt(i)){
                        if(dp[j+1][i-1]==true){
                            dp[j][i]=true;
                 
                        if(k>maxLength){
                            maxLength=k;
                            start=j;
                        }
                        }
                 }
            }
           
        }
      
        return s.substring(start,start+maxLength);
      
     
    }
}