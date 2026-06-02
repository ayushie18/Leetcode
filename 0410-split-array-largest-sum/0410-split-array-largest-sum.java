class Solution {
    public int countSplits(int[] nums,int val){
        int splits=0;
        int subArrSum=0;
        for(int i=0;i<nums.length;i++){
            subArrSum=subArrSum+nums[i];
            if(subArrSum>val){
                splits=splits+1;
                subArrSum=nums[i];
            }
        }
        return splits+1;
    }
    public int splitArray(int[] nums, int k) {
        int minVal=Integer.MIN_VALUE;//maximum of arr
        int maxVal=0;// sum of array
        for(int num: nums){
            minVal=Math.max(num,minVal);
            maxVal+=num;
        }
        int lo=minVal,
            hi=maxVal;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            int subArrCount=countSplits(nums,mid);

            if(subArrCount<=k){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        } 
        return lo;   
        
    }
}