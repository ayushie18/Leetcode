class Solution {
     static final int M = 1_000_000_007;

    List<String> rowStates = new ArrayList<>();
    int[][] dp;

    // generate all valid row states of width = 3
    void generateRowStates(String curr, char prevChar, int len) {
        if (len == 3) {
            rowStates.add(curr);
            return;
        }

        char[] colors = {'R', 'Y', 'G'};
        for (char ch : colors) {
            if (ch == prevChar) continue;
            generateRowStates(curr + ch, ch, len + 1);
        }
    }

    int solve(int remainRows, int prevIdx) {
        if (remainRows == 0) return 1;

        if (dp[remainRows][prevIdx] != -1)
            return dp[remainRows][prevIdx];

        int ways = 0;
        String prev = rowStates.get(prevIdx);

        for (int i = 0; i < rowStates.size(); i++) {
            String curr = rowStates.get(i);
            boolean valid = true;

            // vertical constraint
            for (int j = 0; j < 3; j++) {
                if (prev.charAt(j) == curr.charAt(j)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ways = (ways + solve(remainRows - 1, i)) % M;
            }
        }

        return dp[remainRows][prevIdx] = ways;
    }
    public int numOfWays(int n) {
         generateRowStates("", '#', 0);

        int states = rowStates.size(); // = 12
        dp = new int[n][states];

        for (int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);

        int result = 0;
        for (int i = 0; i < states; i++) {
            result = (result + solve(n - 1, i)) % M;
        }

        return result;
        
    }
}