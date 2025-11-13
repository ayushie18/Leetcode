class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         int n=nums.length;
        // boolean [] present=new boolean[n+1];
        // for(int i:nums){
        //     if(i>=1 && i<=n) present[i]=true;
        // }
         List<Integer>ans=new ArrayList<>();
        // for(int i=1;i<=n;i++){
        //     if(!present[i]){
        //        ans.add(i);
        //     }
        //  }
        // return ans;
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i:nums){
        if(map.containsKey(i)){
            int freq=map.get(i);
            map.put(i,freq+1);
        }
        else map.put(i,1);
    
      }
      for(int i=1;i<=n;i++){
          if(!map.containsKey(i)){
            ans.add(i);
       }

      }

    return ans;
    }
}