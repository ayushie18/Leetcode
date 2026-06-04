class Solution {
    public int findDuplicate(int[] nums) {
        //TC=O(n) SC=O(n)
        // HashSet<Integer> set=new HashSet<>();
        // for(int i:nums){
        //     if(set.contains(i)) return i;

        //     set.add(i);
        // }
        // return -1;
    // CYCLIC SORT
    //    int i=0;
    //    while(i<nums.length){
    //     if(nums[i]==i+1) i++;
    //     else{
    //         if(nums[i]==nums[nums[i]-1]){
    //             return nums[i];
    //         }
    //         swap(i,nums[i]-1,nums);
    //     }
    //    }
    //    return 0;
    //    }
    // public void swap(int x,int y,int [] nums){
    //     int temp=nums[x];
    //     nums[x]=nums[y];
    //     nums[y]=temp;
    // }

       // USING SLOW AND FAST POINTER
        int slow=0;
        int fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
             if(slow==fast) break;
        }
        while(slow!=fast);
        int temp=0;
        while(temp!=slow){
            temp=nums[temp];
            slow=nums[slow];
        }
        return temp;
    }
}