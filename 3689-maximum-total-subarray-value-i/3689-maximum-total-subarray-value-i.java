class Solution {
    public long maxTotalValue(int[] nums, int k) {
     long min=Long.MAX_VALUE;
     long max=Long.MIN_VALUE;        
     long sum=0;

     for(int i=0;i<nums.length;i++){
             max=Math.max(max,nums[i]);
             min=Math.min(min,nums[i]);
             
        }
     return (long)k*(max-min);        
    }
}