class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int []ans=new int[n];
        int i=0;
        int j=n-1;
        int k=n-1;
        while(i<=j){
            if(nums[i]*nums[i]>nums[j]*nums[j]){
                ans[k]=nums[i]*nums[i];
               i++;
            }
            else {
            ans[k]=nums[j]*nums[j];
             j--;
            }
            k--;
        }
        
        // for(int i=0;i<n;i++){
        //     nums[i]=nums[i]*nums[i];
        // }
        // for(int i=0;i<n;i++){// Arrays.sort(nums)
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]>nums[j]){
        //             int temp=nums[i];
        //             nums[i]=nums[j];
        //             nums[j]=temp;
        //         }
        //     }
        // }
        return ans;
        
    }
}