class Solution {
    private boolean exists(int[][] buildings, int x, int y) {
        for (int[] b : buildings) {
            if (b[0] == x && b[1] == y) return true;
        }
        return false;
    }

   public int countCoveredBuildings(int n, int[][] buildings) {
        int ans = 0;

        for (int[] b : buildings) {
            int x = b[0];
            int y = b[1];

            boolean left = false, right = false, up = false, down = false;

            // search left: x-1 → 0
            for (int xx = x - 1; xx >= 0; xx--) {
                if (exists(buildings, xx, y)) {
                    left = true;
                    break;
                }
            }

            // search right: x+1 → n
            for (int xx = x + 1; xx <= n; xx++) {
                if (exists(buildings, xx, y)) {
                    right = true;
                    break;
                }
            }

            // search down: y-1 → 0
            for (int yy = y - 1; yy >= 0; yy--) {
                if (exists(buildings, x, yy)) {
                    down = true;
                    break;
                }
            }

            // search up: y+1 → n
            for (int yy = y + 1; yy <= n; yy++) {
                if (exists(buildings, x, yy)) {
                    up = true;
                    break;
                }
            }

            if (left && right && up && down) {
                ans++;
            }
        }

        return ans;
    }
}
