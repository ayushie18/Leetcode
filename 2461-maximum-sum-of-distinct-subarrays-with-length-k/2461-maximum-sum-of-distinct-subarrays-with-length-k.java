class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long max=0;
        
        for(int i=0;i<=n-k;i++){
           HashSet<Integer> set=new HashSet<>();
            boolean isDup=false;
             int sum=0;
            for(int j=i;j<=i+k-1;j++){
               if(set.contains(nums[j])){
                    isDup=true;
                    break;
                }
                set.add(nums[j]);
                sum+=nums[j];
              
            }
            if(!isDup){
            max=Math.max(max,sum);
            }
        }
       return max; 
    }
}