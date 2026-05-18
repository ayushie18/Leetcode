class Pair{
    int val;
    int row;
    int col;
    Pair(int val,int row,int col){
        this.val=val;
        this.row=row;
        this.col=col;
    }
}    
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix[0].length;
        int ans=0;

        PriorityQueue<Pair> minHeap=new PriorityQueue<>((a,b)->a.val-b.val);

        for(int i=0;i<n;i++){
            minHeap.add(new Pair(matrix[i][0],i,0));
        }
        

        while(k-->0){
            Pair curr=minHeap.poll();
            int val=curr.val;
            ans=val;
            int r=curr.row;
            int c=curr.col;

            if(c+1<n){
                minHeap.add(new Pair(matrix[r][c+1],r,c+1));
            }
        }
        return ans;

        
    }
}