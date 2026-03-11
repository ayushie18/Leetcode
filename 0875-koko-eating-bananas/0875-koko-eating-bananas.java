class Solution {
    public long helper(int [] arr,int x){
        long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=(arr[i]+x-1)/x;

        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(piles[i],max);
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalhrs=helper(piles,mid);
            if(totalhrs<=h){
              high=mid-1;
            }
            else{
              low=mid+1;;
            }

        }
        return low;
        
    }
}