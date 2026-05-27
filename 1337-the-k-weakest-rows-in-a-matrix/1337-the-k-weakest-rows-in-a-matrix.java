class Pair{
    int ones;
    int row;
    public Pair(int ones,int row){
        this.ones=ones;
        this.row=row;
    }

    }
class Solution {
    public int binarySearch(int[] arr){
        int lo=0;
        int hi=arr.length-1;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==1){
                lo=mid+1;
            }
            else{
                hi=mid;
            }
        }
        if(arr[lo]==1) return arr.length;
        return lo;

    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> minHeap=new PriorityQueue<>((a,b)->{
            if(a.ones==b.ones){
                return (a.row-b.row);
            }
            return a.ones-b.ones;
        });
        for(int i=0;i<mat.length;i++){
            int countOnes=0;
            int[] row=mat[i];
            countOnes=binarySearch(mat[i]);
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