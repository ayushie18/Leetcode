class Solution {
    public boolean areSimilar(int[][] mat, int k) {
       int n=mat.length;
       int m=mat[0].length;
       int[][] copy=new int[n][m];
     
       for(int i=0;i<n;i++){
        int shift=k%m;
        for(int j=0;j<m;j++){
            if(i%2==0){
              copy[i][j]=mat[i][(j+shift)%m];
            }
            else{
              copy[i][j]=mat[i][(j-shift+m)%m];
            }
        }

        }
     return Arrays.deepEquals(copy,mat);
       
  }
}