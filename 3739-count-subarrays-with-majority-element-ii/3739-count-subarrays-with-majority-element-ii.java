class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        long res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int cumSum=0;
        int validLeftPt=0;

        for(int i=0;i<nums.length;i++){
           if(nums[i]==target){
                validLeftPt+= map.getOrDefault(cumSum, 0);
                cumSum++;
            }
            else{
                cumSum--;
                validLeftPt-= map.getOrDefault(cumSum, 0);
            }
        map.put(cumSum,map.getOrDefault(cumSum,0)+1);
        res+=validLeftPt;    

        }

     
        return res;
        
    }
}