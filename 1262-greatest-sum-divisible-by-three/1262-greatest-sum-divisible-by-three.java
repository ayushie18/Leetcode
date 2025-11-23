class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;

        // smallest and second smallest numbers with remainder 1 and 2
        int r1min1 = Integer.MAX_VALUE, r1min2 = Integer.MAX_VALUE;
        int r2min1 = Integer.MAX_VALUE, r2min2 = Integer.MAX_VALUE;

        for (int x : nums) {
            sum += x;
            int rem = x % 3;

            if (rem == 1) {
                if (x < r1min1) {
                    r1min2 = r1min1;
                    r1min1 = x;
                } else if (x < r1min2) {
                    r1min2 = x;
                }
            } else if (rem == 2) {
                if (x < r2min1) {
                    r2min2 = r2min1;
                    r2min1 = x;
                } else if (x < r2min2) {
                    r2min2 = x;
                }
            }
        }

        if (sum % 3 == 0) return sum;

        int res = 0;

        if (sum % 3 == 1) {
            int option1 = (r1min1 == Integer.MAX_VALUE) ? 0 : sum - r1min1;
            int option2 = (r2min1 == Integer.MAX_VALUE || r2min2 == Integer.MAX_VALUE)
                          ? 0 : sum - r2min1 - r2min2;
            res = Math.max(option1, option2);
        } else { // sum % 3 == 2
            int option1 = (r2min1 == Integer.MAX_VALUE) ? 0 : sum - r2min1;
            int option2 = (r1min1 == Integer.MAX_VALUE || r1min2 == Integer.MAX_VALUE)
                          ? 0 : sum - r1min1 - r1min2;
            res = Math.max(option1, option2);
        }

        return res;
    }
}
