class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int MOD = 1_000_000_007;
        int m = grid.length;
        int n = grid[0].length;

        // dp[i][j][r] = number of paths to (i, j) with sum % k = r
        int[][][] dp = new int[m][n][k];

        // Base case
        int firstRem = grid[0][0] % k;
        dp[0][0][firstRem] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // (0,0) is already handled
                if (i == 0 && j == 0) continue;

                int valMod = grid[i][j] % k;

                // From top
                if (i > 0) {
                    for (int prevRem = 0; prevRem < k; prevRem++) {
                        int ways = dp[i - 1][j][prevRem];
                        if (ways == 0) continue;
                        int newRem = (prevRem + valMod) % k;
                        dp[i][j][newRem] = (int)((dp[i][j][newRem] + (long)ways) % MOD);
                    }
                }

                // From left
                if (j > 0) {
                    for (int prevRem = 0; prevRem < k; prevRem++) {
                        int ways = dp[i][j - 1][prevRem];
                        if (ways == 0) continue;
                        int newRem = (prevRem + valMod) % k;
                        dp[i][j][newRem] = (int)((dp[i][j][newRem] + (long)ways) % MOD);
                    }
                }
            }
        }

        // We want paths whose sum % k == 0
        return dp[m - 1][n - 1][0];
        
    }
}