class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int preSum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            preSum+=num;
            if(preSum==goal) count++;
            if(map.containsKey(preSum-goal)){
                count+=map.get(preSum-goal);
            }

            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
        
    }
}