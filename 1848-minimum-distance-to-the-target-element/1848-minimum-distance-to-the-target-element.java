class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                int dis=Math.abs(i-start);
                ans=Math.min(dis,ans);
            }
        }
     return ans;
        
    }
}