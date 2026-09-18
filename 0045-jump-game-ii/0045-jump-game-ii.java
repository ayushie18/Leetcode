class Solution {
    public int jump(int[] nums) {
        int ans=0;
        int max=0;// farthest index reachable from all positions in the current jump range
        int curr=0;// end of the range that the current number of jumps can reach
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,i+nums[i]);
            if(i==curr){
                ans++;
                curr=max;
            }

        }
        return ans;
        
    }
}