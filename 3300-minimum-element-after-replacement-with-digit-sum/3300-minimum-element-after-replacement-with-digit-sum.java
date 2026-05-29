class Solution {
    public int sum(int n){
        int s=0;
        while(n>9){
            int dig=n%10;
            s+=dig;
            n/=10;
        }
        return s+n;
    }
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=sum(nums[i]);

        }

        int min=Integer.MAX_VALUE;
        for(int ele:nums){
            min=Math.min(min,ele);
        }

        return min;
        
    }
}