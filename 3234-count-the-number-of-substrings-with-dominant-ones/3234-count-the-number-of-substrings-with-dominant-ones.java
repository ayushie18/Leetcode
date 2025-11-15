class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int ans=0;
        int[] prefixZeroes=new int[n+1];
        int[] prefixOnes=new int[n+1];
        for(int i=0;i<n;i++){
            prefixOnes[i+1]=prefixOnes[i];
            prefixZeroes[i+1]=prefixZeroes[i];
          if(s.charAt(i)=='0'){
            prefixZeroes[i+1]=prefixZeroes[i]+1;
          }
          else 
           prefixOnes[i+1]=prefixOnes[i]+1;
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int zero=prefixZeroes[j+1]-prefixZeroes[i];
                int one=prefixOnes[j+1]-prefixOnes[i];

                if(one>=zero*zero){
               ans++;
            }
        }
        }
        return ans;
        
    }
}