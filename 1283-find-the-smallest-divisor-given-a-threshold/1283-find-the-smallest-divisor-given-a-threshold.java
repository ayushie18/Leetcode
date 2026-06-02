class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=Integer.MAX_VALUE;
        for(int ele:nums){
            max=Math.max(max,ele);
        }
         int lo=1;
         int hi=max;
         int d=1;
         while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int sum=0;
            for(int i=0;i<n;i++){
                if(nums[i]%mid==0) {
                    sum+=nums[i]/mid;
                }
                else{
                    sum+=nums[i]/mid+1;

                }
            }
                if(sum<=threshold){
                    hi=mid-1;
                    d=mid;

                }
                else{
                    lo=mid+1;

                }

            }
    return d;
        
    }
}