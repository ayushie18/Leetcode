class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
      
         
       List<Integer> result = new ArrayList<>();
        
        // Edge case: check for empty matrix
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        // Loop until boundaries cross each other
        while (startRow <= endRow && startCol <= endCol) {
            
            // 1. Move right across the top row
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }
            startRow++; // Move top boundary down

            // 2. Move down the rightmost column
            for (int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            endCol--; // Move right boundary left

            // 3. Move left across the bottom row (if it still exists)
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    result.add(matrix[endRow][j]);
                }
                endRow--; // Move bottom boundary up
            }

            // 4. Move up the leftmost column (if it still exists)
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    result.add(matrix[i][startCol]);
                }
                startCol++; // Move left boundary right
            }
        }

        return result;
       
        
    }
}