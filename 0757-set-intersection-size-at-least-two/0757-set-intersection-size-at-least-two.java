class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->{
            if(a[1]!=b[1]) return Integer.compare(a[1],b[1]);
            return Integer.compare(b[0],a[0]);
        });
        int ans=0;
        int s1=Integer.MIN_VALUE/2;
        int s2=Integer.MIN_VALUE/2; 
        for(int[]in:intervals){
            int l=in[0];int r=in[1];
            if(l>s2){
                ans+=2;
                s1=r-1;
                s2=r;
            }
            else if(l>s1){
                ans+=1;
                s1=s2;
                s2=r;
            }
            
        }
       return ans;
    }
}