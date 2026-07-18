class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int preSum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            preSum+=nums[i];

            int rem=preSum%k;

            if(rem<0){
                rem+=k;
            }
            if(rem==0)count++;

            if(map.containsKey(rem)){
               count+=map.get(rem);
            }

            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
        
    }
}