class Solution {
    public int minFlips(String s) {
        int n=s.length();
        int ones=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        }

        int ans=n;
        ans=Math.min(ans,ones);// All zeroes

        ans=Math.min(ans,n-ones);//All Ones

        ans=Math.min(ans,Math.abs(ones-1));//Exactly one 1

        if(n>1){// Excatly 2 ones placed on 2 ends
            int cost=0;
            if(s.charAt(0)=='0'){
                cost++;
            }
            if(s.charAt(n-1)=='0'){
                cost++;
            }
        for(int i=1;i<n-1;i++){
            if(s.charAt(i)=='1'){
                cost++;
            }

        }
        ans=Math.min(ans,cost);
      }
      return ans;
  }
}