class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int lo=0;
        int hi=n-1;
        if(target>nums[n-1]) return n;
        if(target<nums[0]) return 0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return target-1;
        
    }
}