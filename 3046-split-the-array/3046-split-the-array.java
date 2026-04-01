class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n=nums.length;
        int [] freq=new int[101];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
      
        for(int i=0;i<freq.length;i++){
           if(freq[i]>=3) return false;
           

        }
       
        return true;  
    }
}