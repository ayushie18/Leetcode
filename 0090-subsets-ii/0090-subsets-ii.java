class Solution {
    public void subsets(int[] nums,int idx,List<Integer> curr,List<List<Integer>> ans){
        if(!ans.contains(new ArrayList<>(curr))){
            ans.add(new ArrayList<>(curr));
        }

        for(int i=idx;i<nums.length;i++){
            curr.add(nums[i]);
            subsets(nums,i+1,curr,ans);
            curr.remove(curr.size()-1);
        }


    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();

        ArrayList<Integer> curr=new ArrayList<>();

        subsets(nums,0,curr,ans);
       // Collections.sort(ans);
        return ans;
        
    }
}