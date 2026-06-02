class Solution {
    public boolean helper(int capacity, int[]arr,int d){
        int load=0;
        int days=1;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]<=capacity){
                load+=arr[i];
            }
            else{
                load=arr[i];
                days++;
            }
        }
          
          return days<=d;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int lo=Integer.MIN_VALUE;
        int hi=0;//sum
        for(int i=0;i<n;i++){
            lo=Math.max(lo,weights[i]);
            hi+=weights[i];
          
        }

        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(helper(mid,weights,days)){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;
        
    }
}