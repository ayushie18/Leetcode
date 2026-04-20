class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int ans=Integer.MIN_VALUE;
        //TWO PASS SOLUTION
        // int j=n-1;
        // int i=0;
        // while(i<n){
        //     if(colors[i]!=colors[j]){
        //        ans=Math.max(ans,j-i);
        //     }
        //     i++;
        // }
        // i=0;
        // j=n-1;
        // while(j>0){
        //     if(colors[i]!=colors[j]){
        //        ans=Math.max(ans,j-i);
        //     }
        //     j--;
        // }

        for(int i=0;i<n;i++){
            if(colors[i]!=colors[0]){
                 ans=Math.max(ans,i);
            }
            if(colors[i]!=colors[n-1]){
                 ans=Math.max(ans,n-1-i);
            }
        }
      
       
     return ans;
        
    }
}