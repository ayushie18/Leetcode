class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // int [] freq=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     freq[num]
        // }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        for(int ele:map.keySet()){
            int freq=map.get(ele);
            if(freq>nums.length/3){
                ans.add(ele);
            }

        }
        return ans;

        
    }
}