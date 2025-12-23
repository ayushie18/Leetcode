class Solution {

    // Custom lower bound: first index with value >= target
    private int lowerBound(int[] arr, int target) {
        int lo = 0, hi = arr.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    public int maxTwoEvents(int[][] events) {

        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int n = events.length;

        int[] suffixMax = new int[n];
        suffixMax[n - 1] = events[n - 1][2];

        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], events[i][2]);
        }

        int[] starts = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = events[i][0];
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int end = events[i][1];
            int value = events[i][2];

            ans = Math.max(ans, value);

            int idx = lowerBound(starts, end + 1);

            if (idx < n) {
                ans = Math.max(ans, value + suffixMax[idx]);
            }
        }

        return ans;
    }
}