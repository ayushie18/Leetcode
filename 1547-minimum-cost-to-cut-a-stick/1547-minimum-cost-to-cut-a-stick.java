class Solution {
    public int cuttingCost(int i,int j,int[]nums,int[][]dp){
        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int minC=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int len=nums[j+1]-nums[i-1];
            int totalC=cuttingCost(i,k-1,nums,dp)+cuttingCost(k+1,j,nums,dp)+len;
            if(minC>totalC) minC=totalC;
        }
        return dp[i][j]=minC;
    }
    public int minCost(int n, int[] cuts) {
        int[] arr=new int[cuts.length+2];
        arr[0]=0;
        arr[arr.length-1]=n;
        for(int i=0;i<cuts.length;i++){
            arr[i+1]=cuts[i];
        }

        int[][]dp=new int[cuts.length+2][cuts.length+2];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }
        Arrays.sort(arr);
        return cuttingCost(1,cuts.length,arr,dp);
    }
}