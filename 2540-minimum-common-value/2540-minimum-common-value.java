class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        while(j<nums2.length && i<nums1.length){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums2[j]>nums1[i]){
                 i++;
            }
               
            else{//
                j++;
            }

        }
        return -1;
        
    }
}