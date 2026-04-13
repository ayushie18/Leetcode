class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n=nums.length;
        ArrayList<Integer> ans=new ArrayList<>();
        //Arrays.sort(nums);
        int equalele=0;
        int lessele=0;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                equalele++;
            }
            else if(nums[i]<target) lessele++;
         }

        for(int i=0;i<equalele;i++){
            ans.add(lessele+i);
        }
        
        return ans;
   }
}