class Solution {
    public void findCombination(int idx,int n,int k,ArrayList<Integer> comb,List<List<Integer>> ans){
        if(comb.size()==k){
            ans.add(new ArrayList<>(comb));
            return;
        }
        for(int i=idx;i<=n;i++){
            comb.add(i);
            findCombination(i+1,n,k,comb,ans);
            comb.remove(comb.size()-1);
        }


    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        findCombination(1,n,k,new ArrayList<>(),ans);

        return ans;
    }
}