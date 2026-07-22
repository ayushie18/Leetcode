class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int len=0;
            sum+=nums[i];
            int rem=sum%k;
            
            if(rem<0){
                rem+=k;
            }

            if(rem==0){
                if(i>=1){
                    return true;
                }
            }

            if(map.containsKey(rem)){
                len=i-map.get(rem);
                if(len>=2) return true;
            }
            else{
                map.put(rem,i);
            }

         }
        return false;
        
    }
}