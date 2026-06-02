class Solution {
    public int[] reverse(int[] nums, int start, int end){
        int i=start;
        int j=end;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        return nums;
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(nums,0,n-1);
            return;
        }

        for(int i=nums.length-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                int temp=nums[pivot];
                nums[pivot]=nums[i];
                nums[i]=temp;
                break;
            }
        }

        reverse(nums,pivot+1,n-1);


    }
}