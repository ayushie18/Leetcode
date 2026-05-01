class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int sum=0;
        int f=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            f+=i*nums[i];
        }
        int res=f;
        for(int k=0;k<nums.length;k++){
           int fNew=f+sum- n*nums[n-1-k];
            res=Math.max(res,fNew);
            f=fNew;

        }
        return res;
        
    }
}