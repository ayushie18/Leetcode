class Solution {
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void findPermutate(int[] nums,int idx,List<List<Integer>> ans){
        if(idx==nums.length){
            ArrayList<Integer> curr=new ArrayList<>();
            for(int i:nums){
                curr.add(i);
            }
            // if(!ans.contains(curr)){// when we not use used hashset
            //    ans.add(curr);
            //    return;
            // }
            ans.add(curr);
            return;
        } 
        
         // Stores values already used at this level
          HashSet<Integer> used = new HashSet<>();

        for(int i=idx;i<nums.length;i++){
            // Skip duplicate choices at this level
             if (used.contains(nums[i])){
                 continue;
             } 
             used.add(nums[i]);
            swap(nums,i,idx);
            findPermutate(nums,idx+1,ans);
            swap(nums,i,idx);
        }

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        findPermutate(nums,0,ans);
        return ans;
    }
}