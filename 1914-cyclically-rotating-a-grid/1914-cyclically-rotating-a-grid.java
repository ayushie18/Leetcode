class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        int top = 0;
        int left = 0;
        int bottom = m - 1;
        int right = n - 1;

        while (top < bottom && left < right) {

            int noOfEle = 2 * (bottom - top) + 2 * (right - left);

            int rotation = k % noOfEle;

            while (rotation-- > 0) {

                int temp = grid[top][left];

                // left -> right (top row)
                for (int j = left; j < right; j++) {
                    grid[top][j] = grid[top][j + 1];
                }

                // top -> bottom (right column)
                for (int i = top; i < bottom; i++) {
                    grid[i][right] = grid[i + 1][right];
                }

                // right -> left (bottom row)
                for (int j = right; j > left; j--) {
                    grid[bottom][j] = grid[bottom][j - 1];
                }

                // bottom -> top (left column)
                for (int i = bottom; i > top; i--) {
                    grid[i][left] = grid[i - 1][left];
                }

                grid[top + 1][left] = temp;
            }

            top++;
            left++;
            bottom--;
            right--;
        }

        return grid;

    }
}