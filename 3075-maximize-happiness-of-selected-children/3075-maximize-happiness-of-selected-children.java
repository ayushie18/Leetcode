class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n=happiness.length;
        int i=n-1;
        long ans=0,dec=0;
        while(k>0 &&i>=0 ){
            long val=happiness[i]-dec;
            if(val>0){
                ans+=val;
            }
            dec++;
            i--;
            k--;
            
        }
       return ans; 
    }
}