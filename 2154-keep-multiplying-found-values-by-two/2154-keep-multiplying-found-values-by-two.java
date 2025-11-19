class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
        int i=0;
        while(i<n){
           if(nums[i]==original){
            original=2*original;
             i=0;
           }
           else{
            i++;
           }
           
        }
      return original;  
    }
}