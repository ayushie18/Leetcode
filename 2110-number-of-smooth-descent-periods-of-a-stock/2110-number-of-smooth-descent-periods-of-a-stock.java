class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        int ans=1;
        int len=1;
            for(int i=1;i<n;i++){
            if(prices[i-1]-prices[i]==1){
                len++;
            }
            else{
                len=1;
            }
            ans+=len;
            
        }

    return ans;
    }
}