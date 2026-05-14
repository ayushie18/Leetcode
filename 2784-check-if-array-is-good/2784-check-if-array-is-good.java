class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length-1;
        Arrays.sort(nums);

        for(int i=0;i<=n;i++){

            if(i==n-1){
                if((nums[i]== n) && (nums[i+1]==n))
                return true;
            }
            else{
               if(nums[i]!=i+1){
                return false;
               }
            }
        }
     return false;
        
    }
}