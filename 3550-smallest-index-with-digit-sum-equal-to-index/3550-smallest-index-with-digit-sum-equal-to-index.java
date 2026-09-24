class Solution {
    public int smallestIndex(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){

           if(nums[i]>9){
                int sum=0;
            while(nums[i]>0){
                int dig=nums[i]%10;
                sum+=dig;
                nums[i]/=10;
            }
            if(sum==i){
                ans=i;
                return i;
            }

           }
           else{
            if(nums[i]==i){
                ans=i;
                return i;
            }
           }
        }
      return ans;  
    }
}