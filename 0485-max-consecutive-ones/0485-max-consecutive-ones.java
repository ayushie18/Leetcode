class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max=0;
        int i=0;
        int count=0;
        while(i<n){
            if(nums[i]==1){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;  
            }
        i++;
        }
       return max; 
    }
}