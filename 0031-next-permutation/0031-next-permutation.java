class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int j=n-2;

        while(j>=0&&nums[j]>=nums[j+1]){
            j--;
        }
        if(j>=0){
        for(int i=n-1;i>j;i--){
            if(nums[i]>nums[j]){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                break;
            }
         }
        } 

        int l=j+1;
        int r=n-1;
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
        
    }
}