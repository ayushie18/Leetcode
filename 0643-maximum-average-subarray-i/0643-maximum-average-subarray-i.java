class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0.00;
        double avg=0.00;
       // double maxAvg=Double.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxAvg=(double)sum/k;    
        
        for(int i=k;i<n;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            avg=sum/k;
          maxAvg=Math.max(avg,maxAvg);
        }
        

      return maxAvg;  
    }
}