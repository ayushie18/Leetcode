class Solution {
   public char[][] rotateTheBox(char[][] boxGrid) {
      int n=boxGrid.length;
      int m=boxGrid[0].length;

      char [][] res=new char [m][n];
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            res[j][n-1-i]=boxGrid[i][j];
        }
      }

      for(int j=0;j<n;j++){
         int empty=m-1;
        for(int i=m-1;i>=0;i--){
         
          if(res[i][j]=='*'){
            empty=i-1;

          }
          else if(res[i][j]=='#'){
            res[i][j]='.';
            res[empty][j]='#';
            empty--;
          }
       }
      }

return res;
      
}
}