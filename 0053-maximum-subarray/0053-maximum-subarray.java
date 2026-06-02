class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currSum=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++){
            currSum=Math.max(nums[i],currSum+nums[i]);
            max=Math.max(currSum,max);
        }
        return max;

     
    }
}