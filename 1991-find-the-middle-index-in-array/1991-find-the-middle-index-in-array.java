class Solution {
    public int findMiddleIndex(int[] nums) {
        if(nums.length==1) return 0;
        int sum=0;
        for(int ele:nums){
            sum+=ele;
        }
         
         int leftSum=0;
         int rightSum=sum-nums[0];
         if(leftSum==rightSum) return 0;
        for(int i=1;i<nums.length;i++){
             leftSum+=nums[i-1];
             rightSum=sum-leftSum-nums[i];
            if(rightSum==leftSum){
                return i;
            }
        }
        return -1;
        
    }
}