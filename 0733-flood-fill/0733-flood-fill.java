class Solution {
     class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public void bfs(int i,int j,int[][] image,int color){
    int m=image.length;
    int n=image[0].length;
     int initialC=image[i][j];
    Queue<Pair> q=new LinkedList<>();
    q.add(new Pair(i,j));
    image[i][j]=color;
   

    while(!q.isEmpty()){
        Pair front=q.poll();
        int row=front.row;
        int col=front.col;

        for(int delRow=-1;delRow<=1;delRow++){
         for(int delCol=-1;delCol<=1;delCol++){
             int nrow=row+delRow;
             int ncol=col+delCol;
             if(Math.abs(delRow)+Math.abs(delCol)!=1) continue;

         if(nrow>=0 && nrow<m&& ncol>=0 && ncol<n&& 
            image[nrow][ncol]==initialC){
             
             image[nrow][ncol]=color;
             q.add(new Pair(nrow,ncol));
            }
            }
        }
    }  

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int m=image.length;
    int n=image[0].length;
   
    if(image[sr][sc] == color)
    return image;
    bfs(sr,sc,image,color);
    return image;
        
    }
}