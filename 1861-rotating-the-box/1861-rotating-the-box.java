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
        for(int i=m-1;i>=0;i--){
            if(res[i][j]=='.'){
                int stoneRow=-1;
            for(int k=i-1;k>=0;k--){
              if(res[k][j]=='*'){
                 break;
              }
              else if(res[k][j]=='#'){
                  stoneRow=k;
              }
            }
             if(stoneRow!=-1){
                res[i][j]='#';
                res[stoneRow][j]='.';
            }
        } 
       }
      }

      return res;
      
}
}