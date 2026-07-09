class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;

        int maxPrefix = nums[0];
        int ans = Integer.MIN_VALUE;

        for (int j = k; j < n; j++) {
            maxPrefix = Math.max(maxPrefix, nums[j - k]);
            ans = Math.max(ans, maxPrefix + nums[j]);
        }

        return ans;
       
    }
}