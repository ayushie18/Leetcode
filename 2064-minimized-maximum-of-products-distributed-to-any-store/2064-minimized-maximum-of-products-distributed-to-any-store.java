class Solution {
    public boolean isPossible(int maxVal,int n,int[]arr){
        int stores=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%maxVal==0){
                stores+=arr[i]/maxVal;
            }
            else{
                stores+=arr[i]/maxVal+1;
            }
        }
        return stores<=n;

    }
    public int minimizedMaximum(int n, int[] quantities) {
        int lo=1;
        int hi=0;
        for(int ele:quantities){
            hi=Math.max(ele,hi);
        }

        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(isPossible(mid,n,quantities)){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;
        
    }
}