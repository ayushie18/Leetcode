class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
          int n=nums.length;
          //1
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<=Math.min(n-1,i+k);j++){
        //         if(nums[i]==nums[j]){
        //             if(Math.abs(i-j)<=k){
        //                 return true;
        //             }
        //         }
        //     }
        // }
      //2
        // for(int i=0;i<n;i++){
        //     HashSet<Integer> set=new HashSet<>();
        //     for(int j=i;j<=Math.min(n-1,i+k);j++){
        //         if(set.contains(nums[j])) return true;
        //         set.add(nums[j]);
        //     }
        // }
      //3
      HashSet<Integer> set=new HashSet<>();
      for(int i=0;i<Math.min(k,n);i++){
        if(set.contains(nums[i])) return true;
        set.add(nums[i]);
      }
      for(int i=k;i<n;i++){
        if(set.contains(nums[i]))return true;
        set.add(nums[i]);
        set.remove(nums[i-k]);
      }

     return false;   
    }
}