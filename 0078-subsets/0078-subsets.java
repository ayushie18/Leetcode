class Solution {
    public void findSubsets(int[]nums,int idx,ArrayList<Integer> curr,List<List<Integer>>ans){
        ans.add(new ArrayList<>(curr));

        if (idx == nums.length) {
             return; }

    for (int i = idx; i < nums.length; i++) {
         // Choose
          curr.add(nums[i]);
           // Move forward so we don't choose the same element again
            findSubsets(nums, i + 1, curr, ans);
             // Undo choice (backtracking)
          curr.remove(curr.size() - 1); }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        findSubsets(nums,0,new ArrayList<>(),ans);

        return ans;
        
    }
}