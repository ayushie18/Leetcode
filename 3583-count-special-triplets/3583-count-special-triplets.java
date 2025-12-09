class Solution {
    public int specialTriplets(int[] nums) {
        long result=0;
        int n=nums.length;
        long mod=1000000007;
        HashMap<Integer,Integer> leftmap=new HashMap<>();
        HashMap<Integer,Integer> rightmap=new HashMap<>();
        for(int i=0;i<n;i++){
           rightmap.put(nums[i],rightmap.getOrDefault(nums[i],0)+1);
        }
        for(int ele:nums){
            if (rightmap.containsKey(ele)) {
            rightmap.put(ele, rightmap.get(ele) - 1);
            if (rightmap.get(ele) == 0) {
             rightmap.remove(ele);
            }
}
            int target=ele*2;
            int left=leftmap.getOrDefault(target,0);
            int right=rightmap.getOrDefault(target,0);

            result=result+(1L*left*right)%mod;
            leftmap.put(ele,leftmap.getOrDefault(ele,0)+1);
        }

        return (int)result;
        
    }
}