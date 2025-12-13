class Solution {
    public int findPeakElement(int[] nums) {
        int ans=0;
        if(nums.length==1) return ans;
        if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i-1]<nums[i] && nums[i]>nums[i+1]){
                ans=i;
            }
        }
      return ans;  
    }
}