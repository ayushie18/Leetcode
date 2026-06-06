class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // List<Integer> ans=new ArrayList<>();
        // for(int ele:map.keySet()){
        //     int freq=map.get(ele);
        //     if(freq>nums.length/3){
        //         ans.add(ele);
        //     }

        // }
        // return ans;
       int ans1=0;
       int ans2=0;
       int freq1=0;
       int freq2=0;
       for(int ele:nums){
        if(ele==ans1) freq1++;
        else if(ele==ans2) freq2++;
        
        else if(freq1==0){
            ans1=ele;
            freq1++;
        }
        else if(freq2==0){
            ans2=ele;
            freq2++;
        }
        else{
            freq1--;
            freq2--;
        }
       }
       int count1=0;
       int count2=0;
       for(int ele:nums){
        if(ele==ans1) count1++;
        else if(ele==ans2) count2++;

       }

      List<Integer> ans=new ArrayList<>();
      if(count1>nums.length/3) ans.add(ans1);
      if (count2>nums.length/3) ans.add(ans2);
       


      return ans;  
    }
}