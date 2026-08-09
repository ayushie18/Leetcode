class Solution {
    class Triplet{
        int row;
        int col;
        int step;
        Triplet(int row,int col,int step){
            this.row=row;
            this.col=col;
            this.step=step;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        int[][] vis=new int[n][m];
        Queue<Triplet>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new Triplet(i,j,0));
                    vis[i][j]=1;
                }
            }
        }

       int[][] ans=new int[n][m];
       while(!q.isEmpty()){
        Triplet front=q.poll();
        int row=front.row;
        int col=front.col;
        int step=front.step;
        ans[row][col]=step;
        for(int delRow=-1;delRow<=1;delRow++){
        for(int delCol=-1;delCol<=1;delCol++){
           if(Math.abs(delRow)+Math.abs(delCol)!=1) continue;
            int nrow=row+delRow;
            int ncol=col+delCol;

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
              vis[nrow][ncol]==0){
                q.add(new Triplet(nrow,ncol,step+1));
                vis[nrow][ncol]=1;
              }
         }
       }
    } 


    return ans;     
    }
}