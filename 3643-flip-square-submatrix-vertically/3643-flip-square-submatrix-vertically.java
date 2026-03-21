class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int top = x;
        int bottom = x + k - 1;
        
        while (top < bottom) {
            for (int j = y; j < y + k; j++) {
                int temp = grid[top][j];
                grid[top][j] = grid[bottom][j];
                grid[bottom][j] = temp;
            }
            top++;
            bottom--;
        }
        
        return grid;
     
    //  for(int i=x;i<x+k && i < grid.length;i++){
    //     int left=y;
    //     int right=y+k-1;
         
    //     while(left<right){
    //         int temp=grid[i][left];
    //         grid[i][left]=grid[i][right];
    //         grid[i][right]=temp;

    //         left++;
    //         right--;
    //     } 

    //  }
    //  return grid;
        
    }
}