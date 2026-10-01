class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int l=0;
        int r=0;
        while(r<nums.length){
            if((nums[r]-nums[l])==1){
             max=Math.max(max,r-l+1);
            }
            while(nums[r]-nums[l]>1){
               l++;
              
            }
            r++;
           
        }
        return max;
        
    }
}