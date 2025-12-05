class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int count=0;
        int sum1=0;
        for(int i=0;i<n-1;i++){
            sum1+=nums[i]; 
        int j=i+1;
        int sum2=0;
        while(j<n){
             sum2+=nums[j];
             j++;
        }
        if((sum1-sum2)%2==0) count++;
        }
        return count;
    }
}