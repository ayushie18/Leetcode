class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
     int[][] mat=new int[n][n];
     for(int k=0;k<queries.length;k++){
        int row1=queries[k][0];
        int col1=queries[k][1];
        int row2=queries[k][2];
        int col2=queries[k][3];
        for(int i=row1;i<=row2;i++){
            for(int j=col1; j<=col2;j++){
                mat[i][j]+=1;
            }

        }
       
     } 
      return mat;
    }  
    
}