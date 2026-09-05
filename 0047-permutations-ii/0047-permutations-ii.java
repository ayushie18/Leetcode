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
            if(!ans.contains(curr)){
               ans.add(curr);
               return;
            }
           
        }

        for(int i=idx;i<nums.length;i++){
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