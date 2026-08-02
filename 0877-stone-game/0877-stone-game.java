class Solution {
     Integer[][] dp;

    public int solve(int[] nums, int i, int j) {
        if (i == j)
            return nums[i];

        if (dp[i][j] != null)
            return dp[i][j];

        int takeLeft = nums[i] - solve(nums, i + 1, j);
        int takeRight = nums[j] - solve(nums, i, j - 1);

        return dp[i][j] = Math.max(takeLeft, takeRight);
    }
    public boolean stoneGame(int[] piles) {
         int n = piles.length;
        dp = new Integer[n][n];

        return solve(piles, 0, n - 1) >= 0;
        
    }
}