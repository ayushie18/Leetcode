class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n=matrix.length;
        int negcount=0;
        long maxSum=0;
        int smallestNum=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                maxSum+=Math.abs(matrix[i][j]);

                if(matrix[i][j]<0){
                    negcount++;
                }

                smallestNum=Math.min(smallestNum,Math.abs(matrix[i][j]));
            }
        }
        if(negcount%2==0) return maxSum;
        return maxSum -(2*smallestNum);

        
    }
}