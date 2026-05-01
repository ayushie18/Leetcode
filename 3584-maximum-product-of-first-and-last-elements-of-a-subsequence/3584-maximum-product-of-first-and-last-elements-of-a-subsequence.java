class Solution {
    public long maximumProduct(int[] nums, int m) {
 
       int n=nums.length;
    //     long max=Long.MIN_VALUE;  
    //     for(int i=0;i<n;i++){
    //         for(int j=m-1+i;j<n;j++){
    //             long prod=(long)nums[i]*nums[j];
    //             max=Math.max(prod,max);
    //         }
    //     }
    //    return max; 
    
    long minPre=nums[0];
    long maxPre=nums[0];
    long ans=Long.MIN_VALUE;
    for(int j=m-1;j<n;j++){
        int i=j-m+1;

        minPre=Math.min(nums[i],minPre);
        maxPre=Math.max(nums[i],maxPre);

        long prod1=minPre*nums[j];
        long prod2=maxPre*nums[j];

         ans=Math.max(ans,Math.max(prod1,prod2));

    }
    return ans;

    }
}