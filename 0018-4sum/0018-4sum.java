class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //    for(int j=i+1;j<nums.length;j++){
        //       HashSet<Long> set=new HashSet<>();
        //         for(int k=j+1;k<nums.length;k++){
        //             if(set.contains(target-((long)nums[i]+(long)nums[j]+(long)nums[k]))){
        //                     List<Integer> ans=new ArrayList<>();
        //                     ans.add(nums[i]);
        //                     ans.add(nums[j]);
        //                     ans.add(nums[k]);
        //                     ans.add(target-(nums[i]+nums[j]+nums[k]));
        //                     Collections.sort(ans);
        //                     if(res.contains(ans)) continue;
        //                     res.add(ans);
                        
        //             }
        //             else{
        //                 set.add((long)nums[k]);
        //             }
        //         }
        //     }
        // }
        // return res;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int lo=j+1;
                int hi=nums.length-1;
                while(lo<hi){
                    long sum=(long)nums[i]+(long)nums[j]+(long)nums[lo]+(long)nums[hi];
                    if(sum<target) lo++;
                    else if(sum>target) hi--;
                    else{
                        ArrayList<Integer> ans=new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[lo]);
                        ans.add(nums[hi]);
                        if(!res.contains(ans)){
                              res.add(ans);
                        }
                        lo++;
                        hi--;
                        while(lo<hi&&nums[lo]==nums[lo-1]) lo++;// for duplictae element
                        while(lo<hi&&nums[hi]==nums[hi+1]) hi--;// for duplicate elemnt
                       
                    
                        
                    }
                }

            }
        }
        return res;
    }
}