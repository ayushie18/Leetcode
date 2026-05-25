class Solution {
    public int[] mergeArray(int []nums1, int[]nums2, int[]ans){
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                ans[k++]=nums1[i++];
            }
            else{
                ans[k++]=nums2[j++];
            }
        }
        while(i<nums1.length){
            ans[k++]=nums1[i++];
        }
        while(j<nums2.length){
            ans[k++]=nums2[j++];
        }

        return ans;
        

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] ans=new int[nums1.length+nums2.length];
        ans=mergeArray(nums1,nums2,ans);

        int len=ans.length;
        
        if(len%2!=0) return (ans[len/2]);
        double avg=(ans[(len/2-1)]+ans[(len/2)])/2.0;

        return  avg;



        
    }
}