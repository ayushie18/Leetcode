class Solution {
    int m, n;
    int [][]dp;
    public int solve(int[] nums1,int[] nums2,int i,int j){
        if(i==m||j==n) return  Integer.MIN_VALUE;
       if (dp[i][j] != Integer.MIN_VALUE) return dp[i][j];
        int val=nums1[i]*nums2[j];
        int next = solve(nums1, nums2, i + 1, j + 1);
        int take_i_j = (next == Integer.MIN_VALUE) ? val : val + next;
        int take_i=solve(nums1,nums2,i,j+1);
        int take_j=solve(nums1,nums2,i+1,j);

        dp[i][j]= Math.max(Math.max(val,take_i_j),Math.max(take_i,take_j));
        return dp[i][j];


    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        m=nums1.length;
        n=nums2.length;
        dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=Integer.MIN_VALUE;
            }
        }


        return solve(nums1,nums2,0,0);
    }
}