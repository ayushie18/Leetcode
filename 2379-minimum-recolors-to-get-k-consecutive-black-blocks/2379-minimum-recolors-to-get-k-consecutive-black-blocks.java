class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whiteCount = 0;

        // First window
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
        }

        int ans = whiteCount;

        // Sliding window
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') {
                whiteCount--;
            }

            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }

            ans = Math.min(ans, whiteCount);
        }

        return ans;
        
    }
}