class Solution {
    public int minimumDistance(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
        if(map.containsKey(nums[i])){
            map.get(nums[i]).add(i);
            }
         else{   
         List<Integer> list=new ArrayList<>();
         list.add(i);
         map.put(nums[i],list);
         }

        }
   
       for(List<Integer>list:map.values()){
        int size=list.size();
        if(size<3) continue;
        for(int i=0;i<size-2;i++){
            int i1=list.get(i);
            int i3=list.get(i+2);

            int dis=2*(i3-i1);
            ans=Math.min(ans,dis);

        }
       }
       if(ans==Integer.MAX_VALUE) return -1;
       return ans;
    }
}