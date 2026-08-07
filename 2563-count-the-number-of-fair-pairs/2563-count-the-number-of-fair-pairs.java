class Solution {
    public long countPairs(int[]nums,int target){
        int n=nums.length;
        
        long count=0;
        int i=0;
        int j=n-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum<=target){
               count+=j-i;
               i++;
            }
            else if(sum>target){
               j--;
            }
           
        }
        return count;

    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n=nums.length;
        Arrays.sort(nums);
       
        return countPairs(nums,upper)-countPairs(nums,lower-1);
        
    }
}