class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            int correctIdx=nums[i]-1;
            if(correctIdx<0 || correctIdx>=n){// IMP because here we have -ve no. , 0 ...
                i++;
            }
            else if(nums[i]!=nums[correctIdx]){
                int temp=nums[correctIdx];
                nums[correctIdx]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        int j=0;
        for( j=0;j<nums.length;j++){
          if(nums[j]!=j+1){
            return j+1;
          }
        }
        return j+1;// when j cross nums array and answer is outside array
      
    }
}