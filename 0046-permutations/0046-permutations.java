
class Solution {
    public void swap(int [] nums,int x,int y){
       int temp= nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }

    public void getPerms(int[]nums,int idx,List<List<Integer>> ans){
        if (idx==nums.length){
            List<Integer>Temp=new ArrayList<>();
            for(int ele: nums){
                Temp.add(ele);
            }
            ans.add(Temp);
            return;
        }
     for(int i=idx;i<nums.length;i++){
        swap( nums,idx,i);
        getPerms(nums,idx+1,ans);
        swap(nums,idx,i);
     }   
    }
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>>ans=new ArrayList<>();
       getPerms(nums,0,ans);
       return ans; 
    }
}