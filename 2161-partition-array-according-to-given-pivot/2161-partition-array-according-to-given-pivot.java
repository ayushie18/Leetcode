class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i=0;
        int j=0;
        ArrayList<Integer> arr=new ArrayList<>();
        int[] ans=new int[nums.length];
        while(j<nums.length){
           if(nums[j]<pivot){
            ans[i]=nums[j];
            i++;
           } 
           else{
             if(nums[j]==pivot){
               arr.add(0,nums[j]); 
             }
             else{
               arr.add(nums[j]);
             }
          }
           j++;

        }
        int k=0;
        for(int l=i;l<nums.length;l++){
              ans[l]=arr.get(k);
              k++;
        }
        return ans;

        
    }
}