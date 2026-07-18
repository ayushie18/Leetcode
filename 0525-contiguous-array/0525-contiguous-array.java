class Solution {
    public int findMaxLength(int[] nums) {
        int pre=0;
        int maxLen=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }

            pre+=nums[i];

            if(pre==0){
                maxLen=Math.max(maxLen,i+1);
            }

            if(map.containsKey(pre)){
                maxLen=Math.max(maxLen,i-map.get(pre));
            }
            else{
                map.put(pre,i);
            }
          
        }
        return maxLen;

    }
}