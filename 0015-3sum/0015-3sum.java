class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                long sum=(long)nums[i]+(long)nums[j]+(long)nums[k];
                if(sum<0){
                   j++;
                }
                else if(sum>0){
                  k--;
                }
                else{
                    ArrayList<Integer>ans=new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    res.add(ans);
                    
                    j++;
                    k--;
                while(j<k && nums[j]==nums[j-1]) j++;
               // while(j<k && nums[k]==nums[k+1]) k--;
                }
            }

        }
        return res;
        
    }
}