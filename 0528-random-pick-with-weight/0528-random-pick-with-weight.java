class Solution {
    int[] preSum;

    public Solution(int[] w) {
        preSum=new int[w.length];
        preSum[0]=w[0];
        for(int i=1;i<w.length;i++){
            preSum[i]=preSum[i-1]+w[i];
        }
    }
    
    public int pickIndex() {
        double rand=Math.random();
        double target=rand*preSum[preSum.length-1];
        for(int i=0;i<preSum.length;i++){
           if(target<=preSum[i]){
              return i;
           }
        }
        return 0;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */