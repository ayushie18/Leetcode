class Solution {
    public int triangleNumber(int[] nums) {
        int n=nums.length;
        int k=n-1;
        int count=0;
        Arrays.sort(nums);
        while(k>=2){
            int i=0;
            int j=k-1;
            while(i<j){
              if(nums[k]<nums[i]+nums[j]){
                count+=j-i;
                j--;
              }
              else{
                i++;
              }
              
            }
            k--;

        }
        return count;
    }
}