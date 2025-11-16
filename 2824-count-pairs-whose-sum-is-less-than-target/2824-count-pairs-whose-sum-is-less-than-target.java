class Solution {
    public int countPairs(List<Integer> nums, int target) {
        // int ans=0;//BRUTE FORCE
        // for(int i=0;i<nums.size();i++){
        //     for(int j=i+1;j<nums.size();j++){
        //             if(nums.get(i)+nums.get(j)<target) ans++;
        //     }
        // }
        // return ans;
        int ans=0;
        Collections.sort(nums);
        int lo=0;
        int hi=nums.size()-1;
        while(lo<hi){
            if(nums.get(lo)+nums.get(hi)<target){
             ans+=hi-lo;
             lo++;
            }
            else hi--;
        }
        return ans;

    }
}