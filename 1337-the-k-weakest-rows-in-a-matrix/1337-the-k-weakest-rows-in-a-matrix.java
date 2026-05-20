class Pair{
    int ones;
    int row;
    public Pair(int ones,int row){
        this.ones=ones;
        this.row=row;
    }

    }
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> minHeap=new PriorityQueue<>((a,b)->{
            if(a.ones==b.ones){
                return (a.row-b.row);
            }
            return a.ones-b.ones;
        });
        for(int i=0;i<mat.length;i++){
            int countOnes=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) countOnes++;
             }
             minHeap.add(new Pair(countOnes,i));
        }
        int[] ans=new int[k];
        int i=0;
        while(k-->0){
            Pair curr=minHeap.poll();
            int r=curr.row;
            ans[i]=r;
            i++;
            
        }

        return ans;

        
    }
}