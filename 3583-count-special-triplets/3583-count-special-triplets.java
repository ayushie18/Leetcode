class Solution {
    public int specialTriplets(int[] nums) {
        // TWO PASS SOLUTION
         long result=0;
         int n=nums.length;
         long mod=1000000007;
        // HashMap<Integer,Integer> leftmap=new HashMap<>();
        // HashMap<Integer,Integer> rightmap=new HashMap<>();
        // for(int i=0;i<n;i++){
        //    rightmap.put(nums[i],rightmap.getOrDefault(nums[i],0)+1);
        // }
        // for(int ele:nums){
        //     if (rightmap.containsKey(ele)) {
        //     rightmap.put(ele, rightmap.get(ele) - 1);}
        //     if (rightmap.get(ele) == 0) {
        //      rightmap.remove(ele);
        //     }
        
        //     int target=ele*2;
        //     int left=leftmap.getOrDefault(target,0);
        //     int right=rightmap.getOrDefault(target,0);

        //     result=result+(1L*left*right)%mod;
        //     leftmap.put(ele,leftmap.getOrDefault(ele,0)+1);
        // }

        // return (int)(result%mod);
        //ONE PASS SOLUTION

        HashMap<Integer,Long> validI=new HashMap<>();
        HashMap<Integer,Long> validJ=new HashMap<>();
        for(int num:nums){
            if(num%2==0){
              result=(result+validJ.getOrDefault(num/2,0L))%mod;
            }

            long cnt=(validJ.getOrDefault(num,0L)+validI.getOrDefault(2*num,0L))%mod;
            validJ.put(num,cnt);
            validI.put(num,validI.getOrDefault(num,0L)+1);
        }
        return (int)result;
        
    }
}