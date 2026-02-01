class Solution {
    public int minimumCost(int[] nums) {
      int n=nums.length;
      int arrSum=0;
     

    Arrays.sort(nums,1,n);
    arrSum+=nums[0]+nums[1]+nums[2];
    return arrSum;

        
    }
}