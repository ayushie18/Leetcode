class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        //   for(int i=0;i<n;i++){
        //     if(arr[i]<=k) k++;
        //     else break;

        //   }
        //   return k;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int missedNoTillIdx=arr[mid]-(mid+1);
            if(missedNoTillIdx<k){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }


        }
        return lo+k;
        
    }
}