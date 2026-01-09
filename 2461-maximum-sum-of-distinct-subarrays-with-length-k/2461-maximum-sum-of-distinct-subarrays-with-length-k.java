class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long max=0;
        // BRUTE FORCE
        // for(int i=0;i<=n-k;i++){
        //    HashSet<Integer> set=new HashSet<>();
        //     boolean isDup=false;
        //      int sum=0;
        //     for(int j=i;j<=i+k-1;j++){
        //        if(set.contains(nums[j])){
        //             isDup=true;
        //             break;
        //         }
        //         set.add(nums[j]);
        //         sum+=nums[j];
              
        //     }
        //     if(!isDup){
        //     max=Math.max(max,sum);
        //     }
        // }
        long sum=0;
        int dup=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            // if(!map.containsKey(nums[i])){
            //     map.put(nums[i],0);
            // }
            // map.put(nums[i],map.get(nums[i])+1);
            sum=sum+nums[i];
            if(map.get(nums[i])>1){
                dup+=1;
            }
        }
        if(dup==0){
        max=Math.max(sum,max);
        }
        for(int i=k;i<n;i++){
         int toAdd=nums[i];
         int toRemove=nums[i-k];
          if(!map.containsKey(toAdd)){
                map.put(toAdd,0);
            }
            map.put(toAdd,map.get(toAdd)+1);
            if(map.get(toAdd)>1){
                dup+=1;
            }
            sum=sum+toAdd;
            if(map.get(toRemove)>1){
                dup-=1;
            }
            map.put(toRemove,map.get(toRemove)-1);
            sum=sum-toRemove;
        
        if(dup==0){
        max=Math.max(sum,max);
        }

        }

       return max; 
    }
}