class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int ans=Integer.MIN_VALUE;
        int j=n-1;
        int i=0;
        while(i<n){
            if(colors[i]!=colors[j]){
               ans=Math.max(ans,j-i);
            }
            i++;
        }
      
       
     return ans;
        
    }
}