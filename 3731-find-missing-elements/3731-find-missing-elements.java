class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        

        List<Integer> ans=new ArrayList<>();
       
        for(int i=1;i<nums.length;i++){
            int cur=nums[i];
            int prev=nums[i-1];

           for(int j= prev+1; j<cur;j++ ){
            ans.add(j);
             }
        }

        return ans;

        
    }
}