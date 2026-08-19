class Solution {
    public int deleteAndEarn(int[] nums) {
           int max = 0;

        for (int num : nums) {
            max = Math.max(max, num);
        }

        int[] points = new int[max + 1];

        // Calculate total points for each number
        for (int num : nums) {
            points[num] += num;
        }

        // House Robber DP
        int prev2 = 0;
        int prev1 = 0;

        for (int i = 1; i <= max; i++) {

            int take = points[i] + prev2;
            int skip = prev1;

            int curr = Math.max(take, skip);

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
        
    }
}