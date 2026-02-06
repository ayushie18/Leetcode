class Solution {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int lenBal=0;
        int i=0;
        int j=0;
        Arrays.sort(nums);
        while(j<n){
             min=nums[i];
             max=nums[j];
             while(i<j && max > (long)min*k){
                i++;
                min=nums[i];
             }
         lenBal=Math.max(lenBal,j-i+1); 
         j++;   
        }
       return n-lenBal; 
    }
}