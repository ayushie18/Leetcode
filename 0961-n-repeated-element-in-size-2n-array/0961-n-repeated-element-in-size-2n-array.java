class Solution {
    public int repeatedNTimes(int[] nums) {
        int len=nums.length;
        int n=len/2;
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     for(int i=0;i<nums.length;i++){
    //         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    //     }
    //     for(int key: map.keySet()){
    //         int freq=map.get(key);
    //         if(freq==n) return key;
    //     }
        
    //    return 0; 
    for(int i=0;i<len-1;i++){
        if(nums[i]==nums[i+1]|| nums[i]==nums[i+2]){
            return nums[i];
        }
    }
    return nums[n-1];
     
    }
}