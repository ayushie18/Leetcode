class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        // for(int i=0;i<n;i++){// BRUTE FORCE
        //     for(int j=0;j<m;j++){
        //         if(matrix[i][j]==target){
        //             return true;
        //         }
        //     }
        // }

        int lo=0;
        int hi=n*m-1;
        while(lo<=hi){
            int mid=lo+hi-lo/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                hi=mid-1;
            }
            else if(matrix[row][col]<target){
                lo=mid+1;
            }
        }
      return false;  
    }
}