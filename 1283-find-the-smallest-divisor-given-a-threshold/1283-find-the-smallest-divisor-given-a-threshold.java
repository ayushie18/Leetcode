class Solution {
    public boolean isLess(int n,int[] nums, int k){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%n==0){
                sum+=nums[i]/n;
            }
            else{
                sum+=nums[i]/n+1;
            }
        }
        return sum<=k;

    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=Integer.MAX_VALUE;
        for(int ele:nums){
            max=Math.max(max,ele);
        }
         int lo=1;
         int hi=max;
         int d=1;
         while(lo<hi){
            int mid=lo+(hi-lo)/2;
            // int sum=0;
            // for(int i=0;i<n;i++){
            //     if(nums[i]%mid==0) {
            //         sum+=nums[i]/mid;
            //     }
            //     else{
            //         sum+=nums[i]/mid+1;

            //     }
            // }
            if(isLess(mid,nums,threshold)){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
         }

    return lo;
    }
}