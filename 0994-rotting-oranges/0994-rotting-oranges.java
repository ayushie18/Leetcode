class Solution {
    class Pair{
        int row;
        int col;
        int time;
        Pair(int row,int col,int time){
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }
    public int orangesRotting(int[][] grid) {
     int n=grid.length;
     int m=grid[0].length;
     int[][]vis=new int[n][m];

     Queue<Pair> q=new LinkedList<>();
     int countFresh=0;

     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==2){
                q.add(new Pair(i,j,0));
                vis[i][j]=2;
            }
            else{
                if(grid[i][j]==1){
                    countFresh++;
                }
            }
        }
    }

     int tm=0;
     int count=0;

     while(!q.isEmpty()){
        Pair front=q.poll();
        int row=front.row;
        int col=front.col;
        int time=front.time;
        tm=Math.max(tm,time);

        for(int delRow=-1;delRow<=1;delRow++){
            for(int delCol=-1;delCol<=1;delCol++){
                if(Math.abs(delRow)+Math.abs(delCol)!=1) continue;

                int nrow=row+delRow;
                int ncol=col+delCol;

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 
                && grid[nrow][ncol]==1){
                    q.add(new Pair(nrow,ncol,time+1));
                    vis[nrow][ncol]=2;
                    count++;
                }
            }
        }
    }
     if(count!=countFresh) return -1;
     return tm;
        
 }
}