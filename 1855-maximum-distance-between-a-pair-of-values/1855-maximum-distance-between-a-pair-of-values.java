class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max=Integer.MIN_VALUE;
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if (i>j) {
                 j++;
              } 
            else if(nums1[i]<=nums2[j]){
                max=Math.max(max,j-i);
                j++;
            }
            else i++;
        }
        if(max==Integer.MIN_VALUE) return 0;
        return max;
    }
}