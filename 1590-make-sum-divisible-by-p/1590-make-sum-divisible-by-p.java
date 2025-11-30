class Solution {
    public int minSubarray(int[] nums, int p) {
         int n=nums.length;
    
         long sum=0;
         for(int ele:nums){
            sum+=ele;
         }
         long rem=sum%p;
         if(rem==0) return 0;
         int ans=n;
         HashMap<Long,Integer>map=new HashMap<>();
         map.put(0L,-1);
         long prefix=0;

         for(int i=0;i<n;i++){
           prefix=(nums[i]+prefix)%p; 
           long target=(prefix-rem+p)%p;
           if(map.containsKey(target)){
            ans=Math.min(ans,i-map.get(target));
           }
           map.put(prefix,i);
        }
     return ans==n?-1:ans; 
  }
}