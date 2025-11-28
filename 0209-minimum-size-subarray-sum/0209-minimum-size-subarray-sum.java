class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //      sum+=nums[j];
        //      if(sum>=target){
        //         min=Math.min(min,j-i+1);
        //         break;
        //      }
        //     }
        // }
        int i=0,j=0;
        int sum=0;
        while(j<n){
          sum=sum+nums[j];//Expand
          while(sum>=target){
            min=Math.min(min,j-i+1);
            sum=sum-nums[i];//shrink
            i++;
          }
          j++;
        }

        if (min==Integer.MAX_VALUE){
        return 0;
      } 
     return min; 
    }
}